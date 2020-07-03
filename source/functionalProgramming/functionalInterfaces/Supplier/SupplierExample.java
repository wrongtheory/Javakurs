package functionalProgramming.functionalInterfaces.Supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<LocalDate> supp =  LocalDate::now;
		Supplier<LocalDate> s1 = () -> LocalDate.now();
		System.out.println(supp.get().getYear());
		
		Supplier<Double> db = Math::random;
		System.out.println(db.get());

	}

}
