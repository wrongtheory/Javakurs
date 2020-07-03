package functionalProgramming.functionalInterfaces.UnaryOperator;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntUnaryOperator intunop = x -> {
			return x * x;
		};
		
		System.out.println(intunop.applyAsInt(5));

	}

}
