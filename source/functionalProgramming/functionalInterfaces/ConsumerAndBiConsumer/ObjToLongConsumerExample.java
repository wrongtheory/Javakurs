package functionalProgramming.functionalInterfaces.ConsumerAndBiConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ObjLongConsumer;

public class ObjToLongConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Long> l = Arrays.asList(1l,2l,3l);
		
		ObjLongConsumer<List<Long>> ll = (list,elem) -> {
			list
				.stream()
				.filter(x -> x%2 != 0)
				.map(x -> x+elem)
				.forEach(System.out::println);
		};
		
		ll.accept(l,10);

	}

}
