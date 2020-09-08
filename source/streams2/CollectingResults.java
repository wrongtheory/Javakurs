package streams2;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingResults {

	public static void main(String[] args) {
		
		Stream<String> ohMy = Stream.of("lions","tigers","bears");
		String result = ohMy.collect(Collectors.joining(","));
		System.out.println(result);
		
		
		Stream<String> ohMy2 = Stream.of("lions","tigers","bears");
		Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
		System.out.println(result2);
		
		Stream<String> ohMy3 = Stream.of("lions","tigers","bears");
		TreeSet<String> result3 = ohMy3.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
		System.out.println(result3);
		
		Stream<String> ohMy4 = Stream.of("lions","tigers","bears");
		Map<String, Integer> map = ohMy4.collect(Collectors.toMap(s -> s, String::length));
		System.out.println(map);
		
		Stream<String> ohMy5 = Stream.of("lions","tigers","bears");
		Map<Integer, String> map2 = ohMy5.collect(Collectors.toMap(String::length, k -> k, (s1,s2) -> s1 + " ," + s2, TreeMap::new));
		System.out.println(map2);
		System.out.println(map2.getClass());

	}

}
