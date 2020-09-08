package functionalProgramming.streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamPipeline2Example {

	public static void main(String[] args) {
		
		
		Stream.generate(() -> Stream.of("a","b","c","d").distinct().map(x -> x))
		.limit(4)
		.forEach(System.out::println);

	}

}
