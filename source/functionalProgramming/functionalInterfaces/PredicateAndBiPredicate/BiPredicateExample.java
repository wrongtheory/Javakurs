package functionalProgramming.functionalInterfaces.PredicateAndBiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<String, String> bpr = (a,b) -> a.contains(b);
		System.out.println(bpr.test("kl;k;abc;'l;'l", "abc"));

	}

}
