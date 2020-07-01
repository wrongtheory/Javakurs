package functionalProgramming.tests;

import java.util.stream.Stream;

public class Frage10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.generate(() -> 1)
		//.filter(x -> x.length() > 1)
		.limit(10).map(x -> ++x)
		.forEach(System.out::print);

	}

}
