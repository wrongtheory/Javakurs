package web;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Person2> pers = Person2::new;
		pers.get(); // new Person
		String p = pers.get().firstname;
		System.out.println(p);

	}

}
