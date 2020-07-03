package functionalProgramming.functionalInterfaces.UnaryOperator;

import java.util.Random;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<String> unop = x -> {
			Random r = new Random();
			int p = r.nextInt(10);
			System.out.println(p);
			return x.substring(p);
			
			
		};
		System.out.println(unop.apply("HelloJava"));

	}

}
