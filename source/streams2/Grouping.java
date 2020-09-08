package streams2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> ohMy = Stream.of("lions","tigers","bears");
		Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
		System.out.println(map);
		
		Stream<String> ohMy2 = Stream.of("lions","tigers","bears");
		TreeMap<Integer, List<String>> map2 = ohMy2.collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toList()));
		System.out.println(map2);
		
		
		Stream<String> ohMy3 = Stream.of("lions","tigers","bears");
		Map<Boolean, List<String>> map3 = ohMy3.collect(Collectors.partitioningBy(s -> s.length() <=7));
		System.out.println(map3);
		
		
		Stream<String> ohMy4 = Stream.of("lions","tigers","bears");
		Map<Integer, Long> map4 = ohMy4.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(map4);
		
		
		Stream<String> ohMy5 = Stream.of("lions","tigers","bears");
		Map<Integer, Optional<Character>> map5 = ohMy5.collect(Collectors.groupingBy(String::length, Collectors.mapping(s -> s.charAt(0), Collectors.minBy(Comparator.naturalOrder()))));
		System.out.println(map5);
		

	}

}
