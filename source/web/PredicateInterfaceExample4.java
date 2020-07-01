package web;

import java.util.function.Predicate;

public class PredicateInterfaceExample4 {
	
	private static Predicate<String> hasLengthOf10 = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.length() > 10;
		}
		
	};
	
	private static void predicate_or() {
		Predicate<String> containsLetterA = p -> p.contains("A");
		String containsA = "And";
		boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
		System.out.println(outcome);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		predicate_or();
	}

}
