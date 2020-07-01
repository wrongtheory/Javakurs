package genericsAndCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class mergeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String, String, String> mapper = (v1,v2) -> v1.length() > v2.length() ? v1:v2;
		
		Map<String, String> fav = new HashMap<>();
		
		//fav.put("Jenny", "Bus Tour");
		//fav.put("Tom", "Tram");
		fav.put("Sam", null);
		
		//String jenny = fav.merge("Jenny", "Skyride", mapper);
		//String tom = fav.merge("Tom", "Skyride", mapper);
		
		
		fav.merge("Tom", "Skyride", mapper);
		fav.merge("Sam", "Skyride", mapper);
		
		
		
		System.out.println(fav);
		//System.out.println(jenny);
		//System.out.println(tom);

	}

}
