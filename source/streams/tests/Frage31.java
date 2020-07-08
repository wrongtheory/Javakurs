package streams.tests;

import java.util.stream.Stream;

public class Frage31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Character> stream = Stream.of('c', 'b', 'a');
		
		System.out.println(stream.sorted().findFirst());

	}

}
