package generics.com.basicstrong;

import java.util.ArrayList;

public class Behaviour {

	public static void main(String[] args) {
		
		
		ArrayList<String> l = new ArrayList<>();
		
		l.add("Basics");
		l.add("Strongs");
		
		method(l);
		System.out.println();

	}

	
	public static void method(ArrayList l) {
		
		l.add(10);
		l.add("See This");
		l.add(true);
	}
	
}
