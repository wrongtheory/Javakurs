package streams2;

import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Stream.generate(() -> "Elsa") .filter(n -> n.length() == 4) .sorted()
		 * .limit(2) .forEach(System.out::println);
		 */
		Stream.generate(() -> "Elsa")
		.filter(n -> n.length() == 4)
		.limit(2)
		.sorted()
		.forEach(System.out::println);
		
		
		Stream<Integer> infinite = Stream.iterate(1,  x -> x + 1);
		
		infinite.limit(5)
		.peek(System.out::print)
		.filter(x -> x %2 == 1)
		.forEach(System.out::println);

	}

}
