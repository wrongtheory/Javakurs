package functionalProgramming.streams;

import java.util.stream.Stream;

public class FindAnyAndFindFirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> s = Stream.of( "gorilla", "bonobo", "monkey");
		
		Stream<String> infinite = Stream.generate(()->"chimp");
		
		
		//s.findFirst().ifPresent(System.out::println);
		
		s.findAny().ifPresent(System.out::println);
		
		infinite.findAny().ifPresent(System.out::println);
		
		
		

	}

}
