package genericsAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SomeType<T> {
	
	public <E> void test(Collection<E> collection) {
		for(E e: collection)
			System.out.println(e);
	}
	
	public void test(List<Integer> integerList) {
		for(Integer integer : integerList)
			System.out.println(integer);
	}

	
	static void print(Collection<String> list) {
		for(String string : list)
			System.out.println(string);
	}
	
	public static void main(String[] args) {
		
		
		List<String> strList = new ArrayList<String>();
		List<Object> objList = new ArrayList<Object>();
		
		print(strList);
		//print(objList);
		
		SomeType<?> someType = new SomeType();
		List<String> list = Arrays.asList("value");
		someType.test(list);
		
		List<String> lstr = new ArrayList<String>();
		//List<Object> lobj = lstr;
		
		
		
	}
	
}
