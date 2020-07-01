package generics.com.basicstrong;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("john");
		//list.add(1);
		
		for(String object : list) {
			String str = object; 
			System.out.println(str);
		}
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		Bin<String, Integer> bin = new Bin<>();
		
		bin.setDryTrash("fsdfsdfsd");
		bin.setWetTrash(432423);
		
		System.out.println("dry trash: " + bin.getDryTrash());
		System.out.println("wet trash: " + bin.getWetTrash());
	}

}
