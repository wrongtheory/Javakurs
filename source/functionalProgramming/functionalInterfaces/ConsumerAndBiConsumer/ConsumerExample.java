package functionalProgramming.functionalInterfaces.ConsumerAndBiConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Consumer<Integer> consInt = System.out::println;
		
		Consumer<String[]> consString = a -> {
			for(String s : a)
				System.out.println(s);
		};
		
		consString.accept(new String[] {"123","456"});
		consInt.accept(25);
		
	
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);

		Consumer<List<Integer>> modify = m -> {
			for(int i=0;i<list.size();i++)
				list.set(i, 2 * list.get(i));
		};
		
		Consumer<List<Integer>> display = l -> l.forEach(a -> System.out.println(a + " "));
		
		modify.accept(list);
		
		display.accept(list);
		
	}



}
