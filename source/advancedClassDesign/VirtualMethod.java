package advancedClassDesign;

abstract class Animal{
	public abstract String feed();
}


class Pisica extends Animal {
	public String feed() {
		return prindeSoareci();
	}
	
	public String prindeSoareci() {
		return "Pisica mananca soareci";
	}
}

class Caine extends Animal {
	public String feed() {
		return RodOase();
	}
	
	public String RodOase() {
		return "Cainele roade oase";
	}
}


class Vaca extends Animal {
	public String feed() {
		return PascIarba();
	}
	
	public String PascIarba() {
		return "Vaca paste iarba";
	}
}



public class VirtualMethod {
	
	public static String feedAnimal(Animal animal) {
		return animal.feed();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vaca vaca = new Vaca();
		Animal pisica = new Pisica();
		Caine caine = new Caine();
		
		System.out.println(feedAnimal(vaca));
		System.out.println(pisica.feed());
		
		String cucea = feedAnimal(caine);
		System.out.println(cucea);
	}

}
