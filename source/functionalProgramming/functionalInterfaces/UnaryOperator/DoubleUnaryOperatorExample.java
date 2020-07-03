package functionalProgramming.functionalInterfaces.UnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleUnaryOperator dbunop = x -> {return x;};
		System.out.println(dbunop.applyAsDouble(5.2));

	}

}
