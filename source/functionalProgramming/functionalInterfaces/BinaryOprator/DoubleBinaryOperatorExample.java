package functionalProgramming.functionalInterfaces.BinaryOprator;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DoubleBinaryOperator dbop = (a,b) -> {return a+b;};
			System.out.println(dbop.applyAsDouble(3, 4));
	}

}
