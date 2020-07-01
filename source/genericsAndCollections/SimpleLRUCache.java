package genericsAndCollections;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleLRUCache extends LinkedHashMap<Integer, String>{

	private final int capcaity;
	
	public SimpleLRUCache(int capacity) {
		super(capacity+1, 1.1f, true);
		this.capcaity = capacity;
	}
	
	@Override
	 protected boolean removeEldestEntry(Map.Entry eldest) 
       { 
           return size() > capcaity; 
       } 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}

}
