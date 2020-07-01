package wbs.util;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class EqualsDemo implements Comparable<Object>{
	
	public boolean equals(Object anObject) {
		return this.equals(anObject);
	}
	
	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(sb1.equals(sb2));  //false
		System.out.println(sb1.toString().equals(sb2.toString()));
		System.out.println(sb1==sb2);
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(i1.equals(i2));  //true
		System.out.println(i1==i2);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		AtomicInteger ai1 = new AtomicInteger(1);
		AtomicInteger ai2 = new AtomicInteger(1);
		System.out.println(ai1.equals(ai2));  //false
		System.out.println(ai1==ai2);
		System.out.println(ai1.toString().equals(ai2.toString()));
		System.out.println(ai1.hashCode());
		System.out.println(ai2.hashCode());
		
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(i1);
		set1.add(i2);
		System.out.println(set1.size());  // 1
		
		Set<AtomicInteger> set2 = new HashSet<>();
		set2.add(ai1);
		set2.add(ai2);
		System.out.println(set2.size());  // 2
		
		Set<String> set3 = new HashSet<>();
		set3.add(s1);
		set3.add(s2);
		System.out.println(set3.size());  // 1
		
		Set<StringBuilder> set4 = new HashSet<>();
		set4.add(sb1);
		set4.add(sb2);
		System.out.println(set4.size());  // 2
	}

	
	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
}