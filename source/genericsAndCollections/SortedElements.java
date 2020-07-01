package genericsAndCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedElements {
	
	 private static final int MAX = 3; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		NavigableSet<Integer> sset = new TreeSet();
		
		for(int i=0;i<=10;i++)
			sset.add(i);
		
		System.out.println(sset);
		System.out.println(sset.higher(5));
		System.out.println(sset.headSet(6));
		System.out.println(sset.lower(6));
		System.out.println(sset.floor(7));
		System.out.println(sset.descendingIterator());
		System.out.println(sset.descendingSet());
		System.out.println(sset.pollFirst());
		System.out.println(sset.pollLast());
		System.out.println(sset.subSet(4, 8));
		System.out.println(sset.tailSet(1,false));
		
		
		Map<Integer,String> map = new LinkedHashMap(5,1,true) {
			
			@Override
			 protected boolean removeEldestEntry(Map.Entry eldest) 
	            { 
	                return size() > MAX; 
	            } 
		};
		
		map.put(5, "a");
		map.put(4, "b");
		map.put(3, "c");
		map.put(2, "d");
		map.put(1, "e");
		
		map.get(3);
		map.get(5);
		map.get(1);

		
		
		
		
		System.out.println(map);
		
		Map<Integer,String> map2 = new SimpleLRUCache(2);
		
		map2.put(1, "1");
		map2.put(2, "2");
		map2.put(3, "3");
		
		map2.get(2);
		
		map2.put(9, "9");
		
		System.out.println(map2);
		
	}

}
