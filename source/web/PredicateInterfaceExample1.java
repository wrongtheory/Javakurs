package web;

import java.util.function.Predicate;

public class PredicateInterfaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> lesserthan = i -> (i < 18);
		
		System.out.println(lesserthan.test(10));

	}

}
