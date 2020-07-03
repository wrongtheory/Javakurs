package functionalProgramming.functionalInterfaces.PredicateAndBiPredicate;

import java.util.function.DoublePredicate;

public class DoublePredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublePredicate dpr = x -> x > 1;
		System.out.println(dpr.test(0.5));

	}

}
