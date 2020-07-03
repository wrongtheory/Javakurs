package functionalProgramming.functionalInterfaces.FunctionAndBiFunction;

import java.util.function.ToLongFunction;

import javax.security.auth.x500.X500Principal;

public class ToLongFucntionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToLongFunction<Double> tolong = x -> x.longValue();
		System.out.println(tolong.applyAsLong(34.0));

	}

}
