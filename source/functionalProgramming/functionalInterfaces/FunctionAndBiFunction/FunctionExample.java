package functionalProgramming.functionalInterfaces.FunctionAndBiFunction;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Double> inttotstring = x -> (double)x;
		System.out.println(inttotstring.apply(24));

	}

}
