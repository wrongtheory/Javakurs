package wbs.util;

import java.util.Vector;

public class AutoboxingDemo {
	public static void main(String[] args) {
		Integer i11 = new Integer(100);
		Integer i12 = new Integer(100);
		System.out.println(i11.hashCode());
		System.out.println(i12.hashCode());
		System.out.println(i11.equals(i12));
		
		Integer i21 = 100;
		Integer i22 = 100;
		System.out.println(i21.hashCode());
		System.out.println(i22.hashCode());
		System.out.println(i21.equals(i22));
		
		Integer i31 = Integer.valueOf(100);
		Integer i32 = Integer.valueOf(100);
		System.out.println(i31.hashCode());
		System.out.println(i32.hashCode());
		System.out.println(i31.equals(i32));
		
		Integer i41 = 200;
		Integer i42 = 200;
		System.out.println(i41.hashCode());
		System.out.println(i42.hashCode());
		System.out.println(i41.equals(i42));
		
		Integer i51 = Integer.valueOf(200);
		Integer i52 = Integer.valueOf(200);
		System.out.println(i51.hashCode());
		System.out.println(i52.hashCode());
		System.out.println(i51.equals(i52));
		
		System.out.println(i11 == i12); // false !
		System.out.println(i21 == i22); // true !
		System.out.println(i31 == i32); // true !
		System.out.println(i41 == i42); // false !
		System.out.println(i51 == i52); // false !
		Vector<Integer> v = new Vector<Integer>();
// autoboxing
		v.add(100);
// autounboxing
		int n = v.get(0);
		System.out.println(n);
	}
}