package genericsAndCollections.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class HashtableAndVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  arr = new int[] {1,2,3,4};
		Vector<Integer> v = new Vector();
		Hashtable<Integer, String> h = new Hashtable<>();
		
		v.addElement(1);
		v.addElement(2);
		
		h.put(1, "geeks");
		h.put(1, "4geeks");
		
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
		
		List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3));
		
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<>(Arrays.asList(4,5,6));
		
		l2.addAll(l1);
		
		Collections.sort(l2);
		System.out.println(l2);
		
		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
			
		};
		
		
		Collections.sort(l2,comp);
		System.out.println(l2);
		
		System.out.println(l2.contains(1));
		System.out.println(l2.containsAll(l1));
		System.out.println(l2.equals(l1));
		System.out.println(l2.hashCode());
		System.out.println(l1.hashCode());
		System.out.println(!l2.isEmpty());
		
		Iterator<Integer> it = l2.iterator();
		
		while(it.hasNext()) {
			if(it.next() == 6)
				it.remove();
		}
		
		System.out.println(l2);
		
		//for(Integer i: l2)
			//if(i.equals(3))
				//l2.remove(l2.get(i));  // ConcurrentModificationException
				
		l2.parallelStream().sorted(comp).forEach(s -> System.out.println(s));
		l2.stream().sorted().forEach(s -> System.out.println(s));
		
		//System.out.println(l2.remove(l1.lastIndexOf(1)));
		//System.out.println(l2.removeAll(l1));
		//l2.removeIf(s -> s%2==0);
		
		//l2.retainAll(l1);
		System.out.println(l2.size());
		l2.spliterator();
		l2.stream();
		Integer[] inter = new Integer[l2.size()];
		inter = l2.toArray(inter);
		System.out.println(l2);
		
		for(int i: inter)
			System.out.println(i);
		
		
		
		
		
		
		
		
		
		

	}

}
