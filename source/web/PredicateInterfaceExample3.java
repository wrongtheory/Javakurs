package web;

import java.util.function.Predicate;

public class PredicateInterfaceExample3 {

	private static void pred(int number, Predicate<Integer> predicate) {
		if(predicate.test(number))
			System.out.println(number);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pred(10, i -> i > 7);
	}

}
