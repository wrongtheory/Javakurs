package streams.tests;

import java.util.stream.Stream;

public class Frage34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Boolean> hide = Stream.of(true, false, true);
		
		boolean found = hide.filter(b -> b).anyMatch(b -> 4<4);
		System.out.println(found);

	}

}
