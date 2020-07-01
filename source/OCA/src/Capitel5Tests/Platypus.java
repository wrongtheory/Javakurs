package Capitel5Tests;

class Mamal {
	
	  public Mamal(int age) { System.out.println("Mamal"); }
	 
}

public class Platypus extends Mamal {

	public Platypus() {   
		// super(5);  // so muss es sein
		System.out.println("Platypus");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mamal(5);
	}

}
