package functionalProgramming.functionalInterfaces.ConsumerAndBiConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjIntConsumer;

public class ObjIntConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		ObjIntConsumer<List<Integer>> res = (list1, value) ->
		{
			list1.stream().filter(x -> x%2==0).map(x -> x * value).forEach(System.out::println);
		};
		
		res.accept(list, 2);

	}

}
