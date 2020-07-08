package streams.tests;

import java.util.Optional;

public class Frage17 {

	private static void longer(Optional<Boolean> opt) {
		if(opt.isPresent())
			System.out.println("run: " + opt.get());
	}
	
	private static void shorter(Optional<Boolean> opt) {
		opt.map(x -> "run: " + x).ifPresent(System.out::println);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		longer(Optional.of(false));
		shorter(Optional.of(false));

	}

}
