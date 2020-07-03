package functionalProgramming.functionalInterfaces.BinaryOprator;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntBinaryOperator intbop = (a,b) -> a+b;
		System.out.println(intbop.applyAsInt(1, 2));

	}

}
