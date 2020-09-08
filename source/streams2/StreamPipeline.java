package streams2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StreamPipeline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Toby","Anna","Leroy","Alex");
		List<String> filtered = new ArrayList<String>();
		
		for(String name : list) {
			if(name.length()==4)
				filtered.add(name);
		}
		
		Collections.sort(filtered);
		
		Iterator<String> iter = filtered.iterator();
		
		if(iter.hasNext()) System.out.println(iter.next());
		if(iter.hasNext()) System.out.println(iter.next());
		if(iter.hasNext()) System.out.println(iter.next());
		if(iter.hasNext()) System.out.println(iter.next());
		
		
		
		List<String> list2 = Arrays.asList("Toby","Anna","Leroy","Alex");
		list2.stream().filter(n -> n.length() == 4)
		.sorted()
		.limit(2)
		.forEach(System.out::println);

	}

}
