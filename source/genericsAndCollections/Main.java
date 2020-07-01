package genericsAndCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> display = a -> System.out.println(a);
		
		display.accept(10);
		
		Consumer<List<Integer>> modify = list -> {
			for(int i=0; i < list.size(); i++)
				list.set(i, 2 * list.get(i));
		};
		
		Consumer<List<Integer>> disList = list -> list.stream().forEach(a -> System.out.println(a + " "));
	 	
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);
		
		modify.accept(list);
		disList.accept(list);

	}

}
