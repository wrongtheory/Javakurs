package genericsAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {

	static List<String> list = new ArrayList<>(); // empty list
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		list.add("Flufffy"); //[Fluffy]
		list.add("Webby"); // [Fluffy, Webby]
		
		String[] array = new String[list.size()]; // empty
		
		array[0] = list.get(1);
		array[1] = list.get(0);

		
		for(int i=0; i < array.length; i++)
			System.out.print(array[i] + "-");
		
		
		String[] array2 = {"gerbil","mouse"}; // [gerbil,mouse]
		
		List<String> list1 = Arrays.asList(array2); // returns fixed size list
		
		list1.set(1, "test"); // [gerbil, test]
		array2[0] = "new"; // [new, test]
		
		String[] array3 = (String[]) list1.toArray(); // [new, test]
		
		//list1.remove(1); // yhrows UnsupportedOperationException
		
		String[] array4 = {"1","2","03","05"};
		
		Arrays.sort(array4);
		
		for(String s:array4)
			System.out.println(s);
		
	}

}
