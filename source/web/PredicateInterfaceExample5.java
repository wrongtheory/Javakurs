package web;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateInterfaceExample5 {
	
	private static Predicate<String> hasLengthOf10 = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.length() > 10;
		}
		
	};
	
	private static void predicate_and() {
		Predicate<String> nonNullPredicate = Objects::isNull;
		
		String nullString = "Welc";
		
		boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);
		System.out.println(outcome);
		
		String lengthGTThan10 = "Welcome to the machine";
		
		boolean outcome2 = nonNullPredicate.and(hasLengthOf10).test(lengthGTThan10);
		System.out.println(outcome2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		predicate_and();
	}

}
