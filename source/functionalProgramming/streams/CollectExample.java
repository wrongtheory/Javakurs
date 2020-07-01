package functionalProgramming.streams;

import java.util.stream.Stream;

public class CollectExample {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("w","o","l","f");
		StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		

	}

}
