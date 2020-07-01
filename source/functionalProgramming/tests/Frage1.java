package functionalProgramming.tests;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frage1 {

	public static void main(String[] args) {
		
		
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		System.out.println(stream.limit(2).map(x -> x + "2").count());
		System.out.println(stream);

	}

}
