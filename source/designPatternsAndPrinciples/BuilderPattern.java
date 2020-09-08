package designPatternsAndPrinciples;

import java.util.Arrays;
import java.util.List;

public class BuilderPattern {
	
	private String species;
	private int age;
	private List<String> favoriteFoods;
	
	public BuilderPattern setAge(int age) {
		this.age = age;
		return this;
	}
	
	public BuilderPattern setSpecies(String species) {
		this.species = species;
		return this;
	}
	
	public BuilderPattern setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
		return this;
	}
	
	public ImmutableObjects2 build() {
		return new ImmutableObjects2(species, age, favoriteFoods);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuilderPattern duckBuilder = new BuilderPattern();
		duckBuilder
			.setAge(4)
			.setFavoriteFoods(Arrays.asList("grass","fish"))
			.setSpecies("duck");
		
		ImmutableObjects2 duck = duckBuilder.build();
		
		ImmutableObjects2 flamingo = new BuilderPattern()
				.setFavoriteFoods(Arrays.asList("algee","insects"))
				.setSpecies("flamingo")
				.build();

	}

}
