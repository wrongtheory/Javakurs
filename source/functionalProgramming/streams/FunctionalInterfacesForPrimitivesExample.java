package functionalProgramming.streams;

import java.util.function.BooleanSupplier;

public class FunctionalInterfacesForPrimitivesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BooleanSupplier b1 = () -> true;
		BooleanSupplier b2 = () -> Math.random() > .5;
		System.out.println(b1.getAsBoolean());
		System.out.println(b2.getAsBoolean());
		
	}

}
