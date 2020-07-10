package functionalProgramming.streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamPipeline2Example {

	public static void main(String[] args) {
		
		
		Stream.generate(() ->  "asdf")
		.filter(n -> n.length() == 4)
		.limit(4)
		.sorted()
		.forEach(System.out::println);

	}

}
