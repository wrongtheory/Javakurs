package generics.com.basicstrong;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

	
	public static void display(List<? super Integer> l) {
		
		for (Object t : l) {
			System.out.println(t);
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		List<Number> list1 = new ArrayList<>();
		
		
		list.add(34);
		list.add(57);
		
		list1.add(98);
		list1.add(67);
		
		display(list);
		display(list1);

	}

}
