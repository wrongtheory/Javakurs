package streams.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Frage22 {
	
	private static void spot(Optional<Collection> x) {
		x.filter(y -> y.isEmpty())
		.map(y -> 8)
		.ifPresent(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> l = new ArrayList<>();
		
		spot(Optional.of(l));

	}

}
