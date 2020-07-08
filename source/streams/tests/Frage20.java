package streams.tests;

import java.util.stream.Stream;

public class Frage20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> s = Stream.of("over the river", "through the woods","to grandmother");
		
		s.filter(n -> n.startsWith("t"))
		.sorted((a,b) -> b.compareTo(a))
		.findFirst()
		.ifPresent(System.out::println);

	}

}
