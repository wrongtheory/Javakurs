package functionalProgramming.streams;

import java.util.stream.Stream;

public class StreamCountExample {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "gorilla","bonobo");
		
		System.out.println(s.count());

	}

}
