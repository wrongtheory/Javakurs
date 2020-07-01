
class Reptile{
	public String getName() {
		return "reptile";
	}
}

class Aligator extends Reptile{
	public String getName() {
		return "aligator";
	}
}

class Crocodile extends Aligator{
	public String getName() {
		return "crocodile";
	}
}


public class Polimorph2 {

	public static void feed(Reptile reptile) {
		System.out.println("Feeding: " + reptile.getName());
	}
	
	public static void main(String[] args) {
		feed(new Aligator());
		feed(new Crocodile());
		feed(new Reptile());

	}

}
