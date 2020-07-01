package genericsAndCollections;

import java.util.ArrayList;
import java.util.List;

interface Flyer {
	void fly();
}

class HangGlider implements Flyer {public void fly() {}}
class Goose implements Flyer {public void fly() {}}

public class LegacyAutoboxing {
	
	
	private void anyFlyer(List<Flyer> flyer) {}
	private void groupOfFlyers(List<? extends Flyer> flyer) {}
	
	
	class A{}
	class B extends A {}
	class C extends B {}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.List numbers = new java.util.ArrayList();
		numbers.add(5);
		int result = (int)numbers.get(0);
		System.out.println(result);
		
		
		List<String> keywords = new ArrayList();
		keywords.add("Java");
		printList(keywords);
		
		
		List<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(new Integer(42));
		
		//List<Object> objects = numbers2;
		
		//List<Object> l = new ArrayList<String>();
		
		Object[] o = new String[0];
		Integer[] numbers3 = {new Integer(42)};
		Object[] objects2 = numbers3;
		//objects2[0] = "dsadas";
		
		
		List<? extends Number> list = new ArrayList<Integer>();
		

	}
	
	
	public static long total(List<? extends Number> list) {
		long count = 0;
		for(Number number : list)
			count += number.longValue();
		return count;
	}
	
	public static long total2(List list) {
		long count = 0;
		for(Object obj : list) {
			Number number = (Number)obj;
			count += number.longValue();
		}
			
		return count;
	}
	
	public static void printList(List<?> list) {
		for(Object x: list)
			System.out.println(x);
	}

}
