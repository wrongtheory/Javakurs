package functionalProgramming.functionalInterfaces.Supplier;

import java.util.function.LongSupplier;

public class LongSupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongSupplier lngsp = () -> Long.MAX_VALUE;
		System.out.println(lngsp.getAsLong());

	}

}
