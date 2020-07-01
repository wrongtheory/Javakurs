package designPatternsAndPrinciples;

public class Animal3 {
	
	private String species;
	private int age;
	
	public Animal3(String species) {
		this.setSpecies(species);
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		if(species == null || species.trim().length() == 0) {
			throw new IllegalArgumentException("Species is required");
		}
		this.species = species;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("Age cannot be a negative number");
		}
		
		this.age = age;
	}

}
