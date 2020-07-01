package genericsAndCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) {
				
		Map<Object,String> map = new HashMap<Object,String>();
		
		Object data = new Object();
		
		map.put(data, "information");
		
		System.out.println(map.get(data));
		
		data = null;
		System.gc();
		
		for(int i = 1; i < 10000; i++)
		{
			if(map.isEmpty()) {
				System.out.println("Map is Empty at Iteration " + i);
				break;
			}

		}
		
		System.out.println(map.get(data));
		
		
	}

}
