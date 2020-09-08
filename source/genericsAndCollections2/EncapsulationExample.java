package genericsAndCollections2;

public class EncapsulationExample {

	private String species;
	private int age;
	
	public EncapsulationExample(String species) {
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
		if(age<0) {
			throw new IllegalArgumentException("Age cannot be a negative number");
		}
		this.age = age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
