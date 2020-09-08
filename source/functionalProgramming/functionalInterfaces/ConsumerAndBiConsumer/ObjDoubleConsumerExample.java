package functionalProgramming.functionalInterfaces.ConsumerAndBiConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjDoubleConsumer<Integer> obj = (x,y) -> System.out.println(x+y);

		obj.accept(1, 1);
		
		
		List<Integer> arr = Arrays.asList(1,2,3,4);
		
		ObjDoubleConsumer<List<Integer>> list = (elements,elem) -> {
			elements.stream().forEach(c -> System.out.println(elem * c));
		};
		
		list.accept(arr, 10);
	}

}
