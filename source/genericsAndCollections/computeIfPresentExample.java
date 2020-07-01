package genericsAndCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class computeIfPresentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		
		BiFunction<String, Integer, Integer> mapper = (k,v) -> v + 1;
		
		Integer jenny = counts.computeIfPresent("Jenny", mapper);
		Integer sam = counts.computeIfPresent("Sam", mapper);
		
		System.out.println(counts);
		System.out.println(jenny);
		System.out.println(sam);

	}

}
