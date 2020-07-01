package functionalProgramming.streams;

import java.util.stream.Stream;

public class ForEachExample {

	public static void main(String[] args) {
		
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		s.forEach(System.out::println);

	}

}
