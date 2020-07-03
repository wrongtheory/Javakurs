package functionalProgramming.functionalInterfaces.Supplier;

import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BooleanSupplier bsup = () -> 1 > 1;
		System.out.println(bsup.getAsBoolean());

	}

}
