package functionalProgramming2;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateAndBiPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<String[], Integer> bipr = (list, val) -> {
			for(String s : list) {
				if(s.length()==val)
					System.out.println(s);
			}
			return true;
		};
		
		BiPredicate<String[], Integer> bbb = (list, val) -> {
			for(String s : list) {
				if(s.contains(val.toString()))
					System.out.println(s);
			}
			return true;
		};
		
		
		String[] str = {"a1c","defdasdas","agh", "a2t", "dasd","a3t"};
		//bipr.test(str, 3);
		
		//bbb.test(str, 1);
		
		BiPredicate<String[], Integer> match = bipr.and(bbb);
		//match.test(str, 1);
		
		BiPredicate<String[], Integer> match2 = bipr.and(bbb.negate());
		match2.test(str, 3);
		

	}

}
