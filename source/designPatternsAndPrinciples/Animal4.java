package designPatternsAndPrinciples;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Animal4 {

	private final List<String> favoriteFoods;
	
	public Animal4(List<String> favoriteFoods) {
		if(favoriteFoods == null) {
			throw new RuntimeException("favoriteFood is required");
		}
		
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	
	public List<String> getFavoriteFoods() {
		return favoriteFoods;
	}
	
	public static void main(String[] args) {
		
		List l = new ArrayList<String>();
		l.add("two");
		l.add("one");
		
		Animal4 animal = new Animal4(l);
		System.out.println(animal.getFavoriteFoods().get(0));
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
	}
	
}
