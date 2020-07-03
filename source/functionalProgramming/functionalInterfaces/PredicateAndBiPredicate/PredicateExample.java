package functionalProgramming.functionalInterfaces.PredicateAndBiPredicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> p = x -> x.contains("x");
		System.out.println(p.test("abcx"));

	}

}
