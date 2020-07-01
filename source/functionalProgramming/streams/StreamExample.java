package functionalProgramming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> empty = Stream.empty();
		
		Stream<Integer> singleElement = Stream.of(1);
		
		Stream<Integer> fromArray = Stream.of(1,2,3);
		
		List<String> list = Arrays.asList("a","b","c");
		
		Stream<String> fromList = list.stream();
		
		Stream<String> fromListParallel = list.parallelStream();
		
		System.out.println(fromListParallel);
		
		Stream<Double> randoms = Stream.generate(Math::random);
		
		Stream<Integer> oddNumbers = Stream.iterate(1,  n -> n + 2);
		
		System.out.println(randoms);
		
		System.out.println(oddNumbers);
		
		//randoms.forEach(System.out::println);
		
		oddNumbers.forEach(System.out::println);
		

	}

}
