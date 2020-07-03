package functionalProgramming.functionalInterfaces.FunctionAndBiFunction;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongToDoubleFunction ltd = x -> x;
		System.out.println(ltd.applyAsDouble(55));

	}

}
