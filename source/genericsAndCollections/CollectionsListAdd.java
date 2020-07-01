package genericsAndCollections;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		System.out.println(list.add("Sparrow"));
		System.out.println(list.add("Sparrow"));
		
		Set<String> set = new HashSet<>();
		System.out.println(set.add("Sparrow"));
		System.out.println(set.add("Sparrow"));
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		
		System.out.println(birds.remove("cardinal"));
		System.out.println(birds.remove("hawk"));
		System.out.println(birds);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("SD");
		list2.add(0,"NY");
		list2.add(1,"FL");
		list2.remove("NY");
		list2.remove(0);
		
		Set<Integer> set2 = new HashSet<Integer>();
		boolean b1 = set2.add(66);
		boolean b2 = set2.add(10);
		boolean b3 = set2.add(66);
		boolean b4 = set2.add(8);
		
		for(int integer : set2)
			System.out.println(integer + ",");
		
		
		Set<Integer> set3 = new HashSet<>();
		boolean b5 = set3.add(66);
		boolean b6 = set3.add(10);
		boolean b7 = set3.add(66);
		boolean b8 = set3.add(8);
		
		for(Integer integer : set3)
			System.out.println(integer + ",");
		
		
		NavigableSet<Integer> set4 = new TreeSet<Integer>();
		
		for(int i = 1; i <= 20; i++)
			set4.add(i);
		
		
		System.out.println(set4.lower(10));
		System.out.println(set4.floor(10));
		System.out.println(set4.ceiling(20));
		System.out.println(set4.higher(20));
		
		
		Queue<Integer> queue = new ArrayDeque<>();
		
		System.out.println(queue.offer(10));
		System.out.println(queue.offer(4));
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.remove(4));
		//queue.add(null);
		
		
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(10);
		stack.push(4);
		
		System.out.println(stack.peek());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.peek());
		
		Map<String, String> map = new HashMap<>();
		map.put("koala", "a");
		map.put("koala", "b");
		map.put(null, "meat");
		map.put(null, "leaf");
		
		String food = map.get("koala");
		
		for(String key : map.keySet())
			System.out.println(key + ",");
		
		for(String key : map.values())
			System.out.println(key + ",");
		
		Map<String, String> map2 = new TreeMap<>();
		map2.put("koala", "bamboo");
		map2.put("lion", "meat");
		map2.put("giraffe", "leaf");
		
		String food2 = map2.get("koala");
		
		for(String key : map2.keySet())
			System.out.println(key + ",");
		
		
		for(String key : map2.values())
			System.out.println(key + ",");
		
		
		Map<Integer,String> test = new HashMap<Integer, String>();
		
		test.put(1, "a");
		test.put(1, "b");
		test.put(null, "c");
		test.put(null, "d");
		
		
		System.out.println(test.get(1));
		System.out.println(test.values());
		System.out.println(test.keySet());
		System.out.println(test.size());
		
		
		
		Queue<Integer> test2 = new LinkedList<Integer>();
		
		

	}

}

interface I1{
	void m1();
	
	static void m2() {}
	
	default void m3() {}
}

interface I2 {
	void m1();
	static void m2() {}
	default void m3() {}
}

class A implements I1,I2{
	
	@Override
	public void m1() {
		
	}
	

	public void m2() {}
	
	@Override
	public void m3() {}
}


class C {
	public static void m1() {}
	
	public void m2() {}
}


class D extends C{
	
	
	//public void m1() {}
	
	@Override
	public void m2() {}
}