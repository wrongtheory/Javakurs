package functionalProgramming.functionalInterfaces.PredicateAndBiPredicate;

import java.util.function.IntPredicate;

public class IntPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntPredicate intpr = x -> x%2==0;
		System.out.println(intpr.test(4));

	}

}
