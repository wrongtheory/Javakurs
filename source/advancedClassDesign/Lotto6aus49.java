package advancedClassDesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lotto6aus49 {
	
	@SuppressWarnings("rawtypes")
	private static SortedSet s =  new TreeSet<Integer>();
	

	public static void main(String[] args) {

		for(int i=0; i< 12; i++) {
			while(s.size()!=6) {
				s.add(new Random().nextInt(49)+1);
			}
			
			//List<Integer> list = new ArrayList<Integer>(s);			
			//Collections.sort(list);
			
			s.forEach(a -> System.out.print(a + " "));
			
			s.clear();
			System.out.print("\n");
			
		}
				

	}
}

