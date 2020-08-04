package concurency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
		
		for(Integer item: list) {
			System.out.println(item + " ");
			list.add(9);
		 }
		
		System.out.println();
		System.out.println("Size: " + list.size());

	}

}
