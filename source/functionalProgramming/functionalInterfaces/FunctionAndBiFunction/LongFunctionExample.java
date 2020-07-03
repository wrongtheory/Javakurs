package functionalProgramming.functionalInterfaces.FunctionAndBiFunction;

import java.util.function.LongFunction;

public class LongFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongFunction<Double> toDouble = x -> (double)x + 10;
		System.out.println(toDouble.apply(6));

	}

}
