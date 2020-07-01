package genericsAndCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class computeIfAbsentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 15);
		counts.put("Tom", null);
		
		Function<String, Integer> mapper = (k) -> 1;
		
		Integer jenny = counts.computeIfAbsent("Jenny", mapper);
		
		Integer sam = counts.computeIfAbsent("Sam", mapper);
		
		Integer tom = counts.computeIfAbsent("Tom", mapper);
		
		System.out.println(counts);
		
		
		
		
	}

}
