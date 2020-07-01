package generics.com.basicstrong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subtyping {

	public static void main(String[] args) {
	
		
		Object o = new Object();
		Integer i = Integer.valueOf(11);
		
		o = i;
		
		
		List<Number> list = new ArrayList<>();
		list.add(Integer.valueOf(10));
		list.add(Double.valueOf(10.5));
		//list.add("Hello");
		
		List<Box<Integer>> bList = new ArrayList<>();
		bList.add(new Box(Arrays.asList(1,2,3)));
		bList.add(new SquareBox<>(Arrays.asList(3,4,5,6)));
		
		
		

	}

}
