package designPatternsAndPrinciples;

import java.util.Arrays;
import java.util.List;

public class AnimalBuilder {
	
	private String species;
	private int age;
	private List<String> favoriteFoods;
	
	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	
	public AnimalBuilder setSpecies(String species) {
		this.species = species;
		return this;
	}

	public AnimalBuilder setFavoriteFoods(List<String> favotiteFoods) {
		this.favoriteFoods = favotiteFoods;
		return this;
	}
	
	public Animal5 build() {
		return new Animal5(species, age, favoriteFoods);
	}
	
	public static void main(String[] args) {
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder.setAge(4).setFavoriteFoods(Arrays.asList("grass","fish"))
		.setSpecies("duck");
		
		Animal5 duck = duckBuilder.build();
		
		Animal5 flamingo = new AnimalBuilder()
				.setFavoriteFoods(Arrays.asList("algae","insects"))
				.setSpecies("flamingo").build();
	}
}
