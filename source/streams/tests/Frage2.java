package streams.tests;

import java.util.stream.Stream;

public class Frage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
		
		//boolean b = stream.anyMatch(i -> i > 5); 
		//boolean b2 = stream.allMatch(i -> i > 5);
		boolean b3 = stream.allMatch(i -> i > 5);
		//System.out.println(b); // true
		//System.out.println(b2); // false
		System.out.println(b3);
	}

}
