package functionalProgramming.functionalInterfaces.Supplier;

import java.util.function.IntSupplier;

public class IntSupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntSupplier intsp = () -> Integer.MAX_VALUE;
		System.out.println(intsp.getAsInt());

	}

}
