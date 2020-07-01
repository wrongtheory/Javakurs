package functionalProgramming.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

	public static void main(String[] args) {
		
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		
		String result = ohMy.collect(Collectors.joining(","));
		
		System.out.println(result);
		
		Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
		
		Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
		
		System.out.println(result2);
		
		Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
		
		TreeSet<String> result3 = ohMy3.filter(s -> s.startsWith("t"))
				.collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println(result3);
		
		Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");

		Map<String, Integer> map = ohMy4.collect(Collectors.toMap(s -> s, String::length));
		
		System.out.println(map);
		
		
		Stream<String> ohMy5 = Stream.of("lions", "tigers", "bears");
		
		//Map<Integer, String> map2 = ohMy5.collect(Collectors.toMap(String::length, k -> k));
		
		
		Stream<String> ohMy6 = Stream.of("lions", "tigers", "bears");
		
		Map<Integer, String> map3 = ohMy6.collect(Collectors.toMap(String::length, k -> k, (s1,s2) -> s1 + "," + s2));
		
		System.out.println(map3);
		
		System.out.println(map3.getClass());
		
		
		Stream<String> ohMy7 = Stream.of("lions", "tigers", "bears");
		
		TreeMap<Integer, String> map4 = ohMy7.collect(Collectors.toMap(String::length, k->k, (s1,s2) -> s1 + "," + s2, TreeMap::new));
		
		System.out.println(map4);
		
		System.out.println(map4.getClass());
		
		
		
		Stream<String> ohMy8 = Stream.of("lions", "tigers", "bears");
		
		Map<Integer, List<String>> map5 = ohMy8.collect(Collectors.groupingBy(String::length));
		
		System.out.println(map5);
		
		
		Stream<String> ohMy9 = Stream.of("lions", "tigers", "bears");
		
		Map<Integer, Set<String>> map6 = ohMy9.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
		System.out.println(map6);
		
		
		Stream<String> ohMy10 = Stream.of("lions", "tigers", "bears");
		
		TreeMap<Integer, Set<String>> map7 = ohMy10.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
		
		System.out.println(map7);
		
		
		Stream<String> ohMy11 = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer, List<String>> map8 = ohMy11.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
		System.out.println(map8);
		
		Stream<String> ohMy12 = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map9 = ohMy12.collect(Collectors.partitioningBy(s -> s.length() <= 5));
		System.out.println(map9);
		
		Stream<String> ohMy13 = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map10 = ohMy13.collect(Collectors.partitioningBy(s -> s.length() <= 7));
		System.out.println(map10);
		
		
		Stream<String> ohMy14 = Stream.of("lions", "tigers", "bears");
		Map<Boolean, Set<String>> map11 = ohMy14.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
		System.out.println(map11);
		
		Stream<String> ohMy15 = Stream.of("lions", "tigers", "bears");
		Map<Integer, Long> map12 = ohMy15.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(map12);
		
		Stream<String> ohMy16 = Stream.of("lions", "tigers", "bears");
		//Map<Integer, Optional<Character>> map13 = ohMy16.collect(Collectors.groupingBy(String::length, Collectors.mapping(s->s.charAt(0), Collectors.minBy(Comparator.naturalOrder()))));
		//System.out.println(map13);
		
		Stream<String> ohMy17 = Stream.of("lions", "tigers", "bears");
		//Map<Integer, Optional<Character>> map14 = ohMy17.collect(Collectors.groupingBy(String::length, Collectors.mapping(s -> s.charAt(0), Collectors.minBy(Comparator.naturalOrder()))));
		//System.out.println(map14);
		
		
	}

}
