package streams.tests;

import java.util.stream.Stream;

public class Frage15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Character> stream = Stream.of('a','b','c');
		stream.sorted().findAny().ifPresent(System.out::println);

	}

}
