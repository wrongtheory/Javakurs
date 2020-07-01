package genericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List names = new ArrayList();
		//names.add(new StringBuilder("Webby"));
		names.add("hz");
		printNames(names);

	}
	
	static void printNames(List list) {
		
		for(int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);
			System.out.println(name);
		}
	}

}
