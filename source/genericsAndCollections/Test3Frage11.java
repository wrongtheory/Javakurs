package genericsAndCollections;

import java.util.HashMap;
import java.util.Map;

public class Test3Frage11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> map = new HashMap<>(10);
		
		for(int i = 1; i<= 10; i++)
			map.put(i, i * i);
		System.out.println(map.get(4));

	}

}
