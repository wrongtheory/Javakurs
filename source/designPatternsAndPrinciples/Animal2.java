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


class Prot1 {
	protected static int i  = 1;
}

class Prot2 extends Prot1{
	Prot2(){
		System.out.println(Prot1.i);
	}
}

