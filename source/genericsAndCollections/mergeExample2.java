package genericsAndCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class mergeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String, String, String> mapper = (v1, v2) -> null;
		
		Map<String, String> fav = new HashMap<>();
		
		fav.put("Jenny", "Bus Tour");
		fav.put("Tom", "Bus Tour");
		
		System.out.println(fav);
		
	
		fav.merge("Jenny", "Skyride", mapper);
		fav.merge("Sam", "Skyride", mapper);
		fav.merge("Hz", "Hz", mapper);
		
		System.out.println(fav);

	}

}
