package genericsAndCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Test3Frage5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// HashSet<Number> hs = new HashSet<Integer>();
		HashSet<? super ClassCastException> set = new HashSet<Exception>();
		List<String> list = new Vector<String>();
		//List<Object> values = new HashSet<Object>();
		//List<Object> objects = new ArrayList<? extends Object>();
		Map<String, ? extends Number> hm = new HashMap<String, Integer>();
		

	}

}
