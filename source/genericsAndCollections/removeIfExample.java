package genericsAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class removeIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		System.out.println(list);
		list.removeIf(s->s.startsWith("A"));
		System.out.println(list);
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		list2.replaceAll(x -> x*2);
		System.out.println(list2);
		
		list2.forEach(c -> System.out.println(c));
		list2.forEach(System.out::println);
		
		
		Map<String, String> fav = new HashMap<>();
		fav.put("Jenny", "Bus Tour");
		fav.put("Tom", null);
		
		fav.putIfAbsent("Jenny", "Tram");
		fav.putIfAbsent("Sam", "Tram");
		fav.putIfAbsent("Tom", "Tram");
		System.out.println(fav);
		
		//fav.put("Jenny", "Tram");
		//System.out.println(fav);
	}

}
