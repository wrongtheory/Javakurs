package streams.tests;

import java.util.Optional;

public class Frage27 {

	private static void eatDessert(Optional<String> opt) {
		System.out.println(opt.orElseGet(()->"dasdas"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		eatDessert(Optional.of("Cupcake"));

	}

}
