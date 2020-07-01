package genericsAndCollections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set = new TreeSet();
		
		
		set.add(1234);
		set.add(3);
		set.add(4);
		set.add(12345);
		set.add(2);
		set.add(123456);
		set.add(2);
		set.add(100);
		set.add("hello");
		
		
		
		System.out.println(set);
		
		
		HashSet set2 = new HashSet();
		
		set2.add("hello");
		set2.add(2);
		set2.add(2);
		set2.add(3);
		set2.add(3);
		set2.add(1);
		set2.add(4);
		set2.add(12342341);
		set2.add(2356235);
		set2.add(34563441);
		set2.add(67953441);
		set2.add(3+16);
		set2.add(3+16*2);
		set2.add(3+16*3);
		set2.add(3+16*4);
		set2.add(3+16*5);
		
		
		System.out.println(set2);

	}

}
