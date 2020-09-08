package designPatternsAndPrinciples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ImmutableObjects2 {

	private final String species;
	private final int age;
	private final List<String> favoriteFoods;
	
	public ImmutableObjects2(String species, int age, List<String> favoriteFoods) {
		this.species = species;
		this.age = age;
		if(favoriteFoods == null) {
			throw new RuntimeException("favoriteFood is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	
	public String getSpecies() {
		return species;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}
	
	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}
	
	public String toString() {
		return species + " " + age + " " + favoriteFoods;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImmutableObjects2 lion = new ImmutableObjects2("lion", 5, Arrays.asList("meat","more meat"));
		
		System.out.println(lion);
		
		List<String> favoriteFoods = new ArrayList<String>();
		for(int i = 0; i < lion.getFavoriteFoodsCount();i++) {
			favoriteFoods.add(lion.getFavoriteFood(i));
		}
		
		System.out.println(lion);
		
		favoriteFoods.add("inc ceva");
		
		ImmutableObjects2 updateLion = new ImmutableObjects2(lion.getSpecies(), lion.getAge()+1, favoriteFoods);
		
		System.out.println(lion);
		System.out.println(updateLion);
	}

}
