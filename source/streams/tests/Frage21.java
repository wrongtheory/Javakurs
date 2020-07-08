package streams.tests;

import java.util.stream.Stream;

public class Frage21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> stream = Stream.of(1,2,3);
		
		System.out.println(stream.min((a,b) -> b-a));

	}

}
