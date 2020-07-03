package functionalProgramming.functionalInterfaces.FunctionAndBiFunction;

import java.util.function.IntFunction;

public class IntFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntFunction<String> retString = x -> Integer.toString(x);
		System.out.println(retString.apply(7));

	}

}
