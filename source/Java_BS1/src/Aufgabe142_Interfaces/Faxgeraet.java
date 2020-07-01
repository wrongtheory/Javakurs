package Aufgabe142_Interfaces;

public class Faxgeraet implements Fax {
	
	private static int i = 0;
	
	@Override
	public void senden(String string) {
		
		System.out.println("Absender ist: Fax" + ++i + "\n");
		System.out.println("Das Senden wird simuliert\n"+string + "\n");
		
	}

}
