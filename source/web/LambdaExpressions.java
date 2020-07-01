package web;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressions {

	public static List<String> names = Arrays.asList("peter","anna","mike","xenia");
	
	public static void main(String[] args) {
		
		System.out.println(names);
		
		// Long sort way
		
		/*
		 * Collections.sort(names, new Comparator<String>() {
		 * 
		 * @Override public int compare(String a, String b) { return b.compareTo(a); }
		 * });
		 */
		
		// Second short way
		
		/*
		 * Collections.sort(names, (String a, String b) -> { return b.compareTo(a); });
		 */
		
		// Third short way
		
		//Collections.sort(names, (String a, String b) -> b.compareTo(a));
		
		
		// Fourth short way
		
		//Collections.sort(names, (a,b) -> b.compareTo(a));
		
		/*
		 * Collections.sort(names, new Comparator() {
		 * 
		 * @Override public int compare(Object o1, Object o2) { return
		 * o2.toString().compareTo(o1.toString()); }
		 * 
		 * });
		 */
		Collections.sort(names);
		System.out.println(names);

	}



}
