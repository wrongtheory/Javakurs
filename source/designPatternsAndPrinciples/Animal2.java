package designPatternsAndPrinciples;

public class Animal2 {
	
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal2(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public boolean canHop() {return canHop;}
	public boolean canSwim() {return canSwim;}
	public String toString() {return species;}

}

interface CheckTrait {
	public boolean test(Animal2 a);
}

interface verifica {
	public boolean verify(Animal2 a);
}


