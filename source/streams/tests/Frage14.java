package streams.tests;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Frage14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> print = System.out::println;
		
		Stream<String> s = Stream.of("hi");
		
		s.peek(print)
		.peek(print)
		.map(t -> t)
		.peek(print)
		.forEach(print);

	}

}
