package enthuware;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Test9 {
	
	private String name;
	private int marks;
	
	

	public Test9(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}


	
	

	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getMarks() {
		return marks;
	}





	public void setMarks(int marks) {
		this.marks = marks;
	}





	@Override
	public String toString() {
		return name + ":" + marks;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Test9> ls = Arrays.asList(new Test9("S1", 20), new Test9("S3", 30), new Test9("S3", 20));
		
		//Map<Integer, List<Test9>> group = ls.stream().collect(Collectors.groupingBy(s -> s.getMarks()));
		
		Map<Integer, List<String>> group = ls.stream().collect(Collectors.groupingBy(Test9::getMarks, Collectors.mapping(Test9::getName, Collectors.toList())));
		
		System.out.println(group);
		
		List<Test9> l = Arrays.asList(
				new Test9("Ion", 10),
				new Test9("Victor", 9),
				new Test9("Ann", 8)
				);
		
		Map<String, Integer> bm = l.stream().collect(Collectors.toMap((b->b.getName()), b->b.getMarks()));
		
		BiConsumer<String, Integer> func = (a,b) -> {
			if(a.startsWith("A")) {
				System.out.println(b);
			}
		};
		
		//l.forEach(System.out::print);
		for(Test9 t : l)
			func.accept(t.getName(), t.getMarks());
	}

}
