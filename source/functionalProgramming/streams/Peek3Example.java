package functionalProgramming.streams;

import java.util.stream.Stream;

public class Peek3Example {

	public static void main(String[] args) {
		
		Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
		infinite.limit(5)
		.filter(x -> x % 2 == 1)
		.forEach(System.out::print);
				
		System.out.println();
		
		Stream<Integer> infinite2 = Stream.iterate(1, x -> x + 1);
		
		infinite2.limit(5)
		.peek(System.out::print)
		.filter(x -> x % 2 == 1)
		.forEach(System.out::print);
		
		System.out.println();
		
		Stream<Integer> infinite3 = Stream.iterate(1, x -> x + 1);
		
		infinite3.filter(x -> x % 2 == 1)
		.limit(5)
		.forEach(System.out::print);
			

	}

}
