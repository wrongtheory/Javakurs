package functionalProgramming.functionalInterfaces;

import java.util.function.ToIntFunction;

public class ToIntFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToIntFunction<String> toint = x -> Integer.valueOf(x);
		System.out.println(toint.applyAsInt("123"));

	}

}
