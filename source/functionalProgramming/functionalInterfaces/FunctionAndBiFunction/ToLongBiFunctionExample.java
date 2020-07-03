package functionalProgramming.functionalInterfaces.FunctionAndBiFunction;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToLongBiFunction<Double, Double> tolong = (x,y) -> (long)(x*y);
		System.out.println(tolong.applyAsLong(7.0, 2.0));

	}

}
