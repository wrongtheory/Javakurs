package functionalProgramming.functionalInterfaces.FunctionAndBiFunction;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToIntBiFunction<Double, String> toint = (x,y) -> x.intValue() + Integer.valueOf(y);
		System.out.println(toint.applyAsInt(3.0, "21"));

	}

}
