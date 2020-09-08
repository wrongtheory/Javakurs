package genericsAndCollections2;

import java.util.function.Predicate;

class Animal2 {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal2(String species, boolean hopper, boolean swimmer) {
		this.species = species;
		this.canHop = hopper;
		this.canSwim = swimmer;
	}
	
	public boolean canHop() {return canHop;}
	public boolean canSwim() {return canSwim;}
	public String toString() {return species;}
	
	
	public static void print2(Animal2 animal, Predicate<Animal2> trait) {
		if(trait.test(animal))
			System.out.println(animal);
	}
}


interface CheckTrait{
	public boolean test(Animal2 a);
}

public class FunctionalInterface2 {
	
	private static void print(Animal2 animal, CheckTrait trait) {
		if(trait.test(animal))
			System.out.println(animal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(new Animal2("fish", false, true), a -> a.canHop());
		print(new Animal2("kangoroo", true, false), a-> a.canHop());
		Animal2.print2(new Animal2("tigru", true, true), a -> a.canHop());
		
	}

}
