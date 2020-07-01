package generics.com.basicstrong;

import java.util.ArrayList;
import java.util.List;

public class ArraytoList {
	
	public static <T> List<T> toList(T[] array){
		
		List<T> list = new ArrayList<T>();
		for(T i : array) {
			list.add(i);
		System.out.print(i + ", ");	
		}
		System.out.println();
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3}; 
		
		toList(new Integer[] {1,2,3});
		toList(new Float[] {1.1f,2.2f,3.3f});
		toList(new Double[] {1.1,2.2,3.3});
		toList(new Character[] {'a','b','c'});
	}

}
