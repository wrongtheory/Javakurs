package concurency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> data = java.util.Collections.synchronizedList(new ArrayList<>());
		
		Arrays.asList(1,2,3,4,5,6).parallelStream()
		.map(i -> {data.add(i); return i;})
		.forEachOrdered(i -> System.out.print(i + " "));

		
		System.out.println();
		
		for(Integer e : data)
			System.out.print(e + " ");
		
		System.out.println();
		
		System.out.println(Arrays.asList(1,2,3,4,5,6).stream().findAny().get());

		System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get());
		
		System.out.println(Arrays.asList('w','o','l','f')
				.parallelStream()
				.reduce("",(c,s1) -> c + s1, (s2,s3) -> s2+s3 ));
		
		
		Stream<String> stream = Stream.of("w","o","l","f").parallel();
		SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
		
		System.out.println(set);
		
		
		
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
		
		ConcurrentMap<Integer, String> map = ohMy.collect(Collectors.toConcurrentMap(String::length, k -> k, (s1,s2) -> s1 + " ," + s2));
		
		System.out.println(map);
		System.out.println(map.getClass());
		
		Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears").parallel();
		Map<Integer, List<String>> map2 = ohMy2.collect(Collectors.groupingBy(String::length));
		
		System.out.println(map2);
		
	}

}
