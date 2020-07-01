package genericsAndCollections;

import java.util.Arrays;
import java.util.Comparator;

public class Test3Frage10 implements Comparator<String>{
	
	public int compare(String a, String b) {
		return b.toLowerCase().compareTo(a.toLowerCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] values = {"123","Abb","aab"};
		Arrays.sort(values, new Test3Frage10());
		
		for(String s : values)
			System.out.println(s);
	}

}
