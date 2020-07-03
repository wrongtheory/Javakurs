package functionalProgramming.functionalInterfaces.FunctionAndBiFunction;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntToDoubleFunction inttodouble = x -> x;
		System.out.println(inttodouble.applyAsDouble(8));

	}

}
