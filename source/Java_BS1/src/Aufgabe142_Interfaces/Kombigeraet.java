package Aufgabe142_Interfaces;

public class Kombigeraet implements Fax, Drucker{

	private static int i = 0, j=0;
	
	@Override
	public void senden(String string) {
		
		System.out.println("Absender ist: Kombigeraet "+ ++i + "\n");
		System.out.println("Das senden wird simuliert");
		System.out.println(string + "\n");
		
	}

	@Override
	public void drucken(String string) {
		
		System.out.println("Kombigeraet Kombigeraet"+ ++j + " meldet sich\n");
		System.out.println("Es wird gedruckt\n"+string+ "\n");
		
	}

}
