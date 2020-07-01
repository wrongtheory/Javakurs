package functionalProgramming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

// A Supplier is used when you want to generate or supply values without taking any input
// A Supplier is often used when constructing new objects


public class SupplierExample {
	
	
	@Override
	public String toString() {
		return "SupplierExample [toString()=" + super.toString() + "]";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1);
		System.out.println(d2);
		
		Supplier<StringBuilder> t1 = StringBuilder::new;
		Supplier<StringBuilder> t2 = () -> new StringBuilder();
		
		System.out.println(t1.get());
		System.out.println(t2.get());
		
		Supplier<ArrayList<String>> al1 = ArrayList<String>::new;
		ArrayList<String> a1 = al1.get();
		System.out.println(al1);
		System.out.println(a1);
		
		

	}

}
