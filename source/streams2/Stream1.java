package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> empty = Stream.empty();
		Stream<Integer> singleElement = Stream.of(1);
		Stream<Integer> fromArray = Stream.of(1,2,3);
		
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> fromList = list.stream();
		Stream<String> formListParallel = list.parallelStream();

		
		Stream<Double> ransoms = Stream.generate(Math::random).limit(10);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2).limit(10);
		
		ransoms.forEach(System.out::println);
		oddNumbers.forEach(System.out::println);
		
	}

}
