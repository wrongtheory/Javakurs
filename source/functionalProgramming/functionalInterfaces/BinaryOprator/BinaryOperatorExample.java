package functionalProgramming.functionalInterfaces.BinaryOprator;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryOperator<String> bin = (a,b) -> a.concat(b);
		System.out.println(bin.apply("Hello ", " World"));

	}

}
