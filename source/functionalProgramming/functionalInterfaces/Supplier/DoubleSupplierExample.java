package functionalProgramming.functionalInterfaces.Supplier;

import java.util.function.DoubleSupplier;

public class DoubleSupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleSupplier dbsp =  Math::random;
		System.out.println(dbsp.getAsDouble());

	}

}
