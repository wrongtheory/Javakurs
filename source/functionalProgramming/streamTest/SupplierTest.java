package functionalProgramming.streamTest;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierTest {
	
	static int i ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdef";
		
		
		Supplier<String> supl = String::new;
		Supplier<String> supl2 = () -> new String();
		Supplier<String> supl3 = () -> new String().valueOf(true);
		Supplier<Character> supl4 = () -> s.charAt(i);
		
		String s1 = supl.get();
		String s2 = supl3.get();
		char a = supl4.get();
		
		System.out.println(Optional.ofNullable(s1).orElse("Hi"));
		System.out.println(s2);
		


	}

}
