package designPatternsAndPrinciples;

public class FindMatchingAnimals {
	
	private static void print(Animal2 animal, CheckTrait trait) {
		if(trait.test(animal))
			System.out.println(animal);
	}
	
	public static void print2(Animal2 animal, verifica v) {
		if(v.verify(animal))
			System.out.println(animal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(new Animal2("fish", false,true), a -> a.canHop());
		
		print(new Animal2("kangoroo", true, false), a -> a.canHop());
		
		print2(new Animal2("dog", true, false), (Animal2 a) -> {return a.canHop();});

	}

}
