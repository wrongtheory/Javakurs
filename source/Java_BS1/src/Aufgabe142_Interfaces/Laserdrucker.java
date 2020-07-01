package Aufgabe142_Interfaces;

public class Laserdrucker implements Drucker {

	private static int i = 0;
	
	@Override
	public void drucken(String string) {
		
		System.out.println("Drucker Laser" + ++i + " meldet sich\n");
		System.out.println("Es wird gedruckt\n"+string + "\n");
		System.out.println(string + "\n");
		
	}

}
