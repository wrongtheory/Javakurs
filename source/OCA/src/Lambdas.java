import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*interface CheckTrait{
	boolean test(Animal a);
}*/

/*class CheckIfHopper implements CheckTrait {
	@Override
	public boolean test(Animal a) {
		
		return a.canHop();
	}
}*/

class Animal{
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public boolean canHop() {return canHop;}
	public boolean canSwim() {return canSwim;}
	public String toString() {return species;}
}

public class Lambdas {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		//print(animals, new CheckIfHopper());
		print(animals, a -> a.canHop());
		print(animals, a -> a.canSwim());
		print(animals, a -> ! a.canSwim());
		
		
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies);
		
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies);
	}
	
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal animal : animals) {
			if(checker.test(animal))
				System.out.println(animal + " ");
		}
		System.out.println();
	}
}
