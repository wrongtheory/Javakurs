package functionalProgramming.functionalInterfaces.PredicateAndBiPredicate;

import java.util.function.LongPredicate;

public class LongPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongPredicate lpr = x -> x!=0;
		System.out.println(lpr.test(1));
	}

}
