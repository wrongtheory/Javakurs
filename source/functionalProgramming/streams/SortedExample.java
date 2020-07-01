package functionalProgramming.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedExample {

	public static void main(String[] args) {
		
		
		Stream<String> s = Stream.of("brown-","bear-");
		
		//s.sorted().forEach(System.out::print);
		
		Stream<String> s2 = Stream.of("brown bear-","grizzly");
		
		s2.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);

	}

}
