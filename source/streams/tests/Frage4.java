package streams.tests;

import java.util.stream.Stream;

public class Frage4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> stream = Stream.of("base", "ball");
		//stream.map(s -> s.length()).forEach(System.out::print);
		stream.mapToInt(s -> s.length()).forEach(System.out::print);

	}

}
