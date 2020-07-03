package functionalProgramming.functionalInterfaces;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongToIntFunction lti = x -> (int)x;
		System.out.println(lti.applyAsInt(2));

	}

}
