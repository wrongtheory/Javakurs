package genericsAndCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3Frage7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));
		numbers.add(75);
		numbers.add(new Integer(86));
		numbers.add(null);
		numbers.add(309L);
		
		Iterator it = numbers.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}

}
