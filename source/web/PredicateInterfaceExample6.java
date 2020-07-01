package web;

import java.util.function.Predicate;

public class PredicateInterfaceExample6 {
	
	private static Predicate<String> hasLengthOf10 = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.length() > 10;
		}
		
	};
	
	private static void predicate_negate() {
		String lengthGTThan10 = "Thunderstruck is a 2012 children's "
                + "film starring Kevin Durant"; 
		
		boolean outcome = hasLengthOf10.negate().test(lengthGTThan10);
		System.out.println(outcome);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			predicate_negate();
	}

}
