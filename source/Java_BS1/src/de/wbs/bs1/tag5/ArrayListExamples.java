package de.wbs.bs1.tag5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		StringBuffer st = new StringBuffer();
		
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(st.capacity());
		System.out.println(st.length());
		
		Integer[] arr = new Integer[] {3,9,1,4,2};
		
		Collections.sort(Arrays.asList(arr));
		
		System.out.println(Arrays.asList(arr));
		
		int i = 10;
		
		Integer integer1 = i;
		
		Void v = null;
		
		System.out.println(integer1);

		list.add(3);
		list.add(5);
		list.add(7);
		list.add(1, 17);
		list.remove(3);

		for (int j : list) {
			System.out.println(i);
		}
		
		System.out.println(10+-5);
		
		String a = "a";
		StringBuffer str = new StringBuffer(a);
		
		if(a==str.toString()) {}
		
		String let = "abcdef";
		System.out.println(let.length());
		System.out.println(let.charAt(3));
		let+="g";
		System.out.println(let.charAt(6));
		System.out.println(let);
	}
	

}
