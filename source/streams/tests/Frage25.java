package streams.tests;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Frage25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream ints = IntStream.empty();
		IntStream moreInts = IntStream.of(66,77,88);
		
		Stream.of(ints,moreInts)
			.flatMapToInt(x -> x).forEach(System.out::println);

	}

}
