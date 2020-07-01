package generics.com.basicstrong;

import java.util.Arrays;
import java.util.List;

public class RawTypeDemo {

	public static void main(String[] args) {
		
		Box<Integer> genBox = new Box<Integer>(Arrays.asList(1,2,3));
		
		for (Integer integer : genBox.getA()) {
			System.out.println(integer);
		}
		
		Box rawBox = new Box(Arrays.asList(1,2,"baiscsStrong"));
		
		
		for (Object obj : rawBox.getA()) {
			System.out.println(obj);
		}

	}

}
