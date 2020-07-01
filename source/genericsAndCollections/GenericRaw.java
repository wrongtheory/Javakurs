package genericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class GenericRaw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List rawList = new ArrayList();
		List<String> list = new ArrayList<>();
		
		System.out.println(rawList);
		System.out.println(list);
		
		rawList = list;
		rawList.add(8);
		
		System.out.println(rawList);
		System.out.println(list);
		
		//String s = list.get(0);

	}

}
