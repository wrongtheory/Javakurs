package genericsAndCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3Frage15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Integer> c = (o1, o2) -> o1 - o2;
		
		List<Integer> list = Arrays.asList(5,4,7,1);
		
		System.out.println(list);
		
		Collections.sort(list,c);
		
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, 1));

	}

}
