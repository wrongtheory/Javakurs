package functionalProgramming.functionalInterfaces.FunctionAndBiFunction;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionExample {

	public static void main(String[] args) {
		
		
		IntToLongFunction inttilong = x -> x;
		System.out.println(inttilong.applyAsLong(5));

	}

}
