package streams2.tests;

import java.util.stream.Stream;

public class Frage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		stream.limit(2).map(x -> x + "2").forEach(System.out::println);

	}

}
