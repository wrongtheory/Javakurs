package functionalProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Consumer take 1 parameter and return nothing (void)
// BiConsumer take 2 parameters and return nothing (void) 

public class ConsumerAndBIConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		
		c1.accept("Annie");
		c2.accept("Jora");
		
		Map<String, Integer> map = new HashMap<>();
		
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		
		System.out.println(map);
		
		
		Map<String, String> map2 = new HashMap<String, String>();
		
		BiConsumer<String, String> d1 = map2::put;
		BiConsumer<String, String> d2 = (k, v) -> map2.put(k, v);
		
		d1.accept("chicken", "Cluck");
		d2.accept("chick", "Tweep");
		
		System.out.println(map2);
		
		
		//Stream<String> stream = Stream.of("w","o","l","f");
		
		//TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		
		//System.out.println(set);
		
		
		Stream<String> stream2 = Stream.of("w","o","l","f");
		TreeSet<String> set2 = stream2.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set2);
		
		Stream<String> stream3 = Stream.of("w","o","l","f");
		Set<String> set3 = stream3.collect(Collectors.toSet());
		System.out.println(set3);

	}

}
