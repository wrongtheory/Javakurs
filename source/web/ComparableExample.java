package web;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableExample implements Comparable<String>{

	public static void main(String[] args) {
		
		String[] s = {"xx","gg","cc","tt"};
		
		String a = "victor";
		String b = "Victor";
		String c = "other";
		String d = "victor";
		String e = new String("victor");
		
		Integer x = 1;
		Integer y = 2;
		Integer z = 3;
		
		for(String t : s)
			System.out.print(t + " ");
		
		Arrays.sort(s, new Comparator<String>() {

		

			/*
			 * @Override public int compare(Object o1, Object o2) { // TODO Auto-generated
			 * method stub return o2.toString().compareTo(o1.toString()); }
			 */

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}

				
			
		});
		
		for(String t : s)
			System.out.print(t + " ");
		
		
		System.out.println(a==b);
		System.out.println(a.equals(b));

		System.out.println(a==d);
		System.out.println(a.equals(d));
		
		System.out.println(a==e);
		System.out.println(a.equals(e));
		
		if(a.compareTo(b) > 1)
			System.out.println("a>b");
		else
			if(a.compareTo(b)<1)
				System.out.println("a<b");
			else
				System.out.println("a==b");
		
		if(x.compareTo(y) > 1)
			System.out.println("x>y");
		else
			if(x.compareTo(y)<1)
				System.out.println("x<y");
			else
				System.out.println("x==y");
		//System.out.println(a.compareTo(b));
	}



	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
