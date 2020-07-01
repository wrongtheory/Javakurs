package timeLambdaString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Shoot {
	
	List<String> l = new ArrayList();
	
	static String a = "abc";
	static String[] array = {"a","b"};
	
	interface Target{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate pred = c -> c.equals("a");

		List<String> m = Arrays.asList(array);
		m.set(0, "c");
		//m.remove("b");
		System.out.println(m.contains("d"));
		
		
		boolean b = a.startsWith("abcd");
		System.out.println(b);
		a = a.replace("ab", "xy");
		System.out.println(a);
	}

}
