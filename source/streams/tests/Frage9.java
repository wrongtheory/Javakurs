package streams.tests;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frage9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Character> chars = Stream.of('a','b');
		
		chars.map(c -> c).collect(Collectors.toList()).forEach(System.out::println);

	}

}
