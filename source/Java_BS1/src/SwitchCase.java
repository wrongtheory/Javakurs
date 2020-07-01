
public class SwitchCase {
	
	public static void main(String[] args) throws Exception{
		
		
		
		//System.out.println(input);
				char input;
		
			do  {
				
				//System.out.println("Wählen 1, 2 oder 3");
				
			System.out.println("1 - Angebot");
			System.out.println("2 - Rechnung");
			System.out.println("3 - Kasse");
			System.out.println("0 - Exit");
			input = (char)System.in.read();
			
			switch (input) {
			case '1':
				System.out.println("1 - Heute ist ein Angebot");
				break;
			case '2':
				System.out.println("2 - Jetzt kommt die Rechnung");
				break;
			case '3':
				System.out.println("3 - Gehen Sie bitte zur Kasse");
				break;
			case '0':
				System.exit(0);
			//default:
				//System.out.println("Falsche Angabe, Versuchen Sie nochmal");
			}
			//System.out.println('\n');
			//System.out.println('\n');
			//System.out.println('\t');
			//System.out.println('\t');
			
			//input = (char) System.in.read();
			
			System.in.skip(3);
			} while(input >= 1);
	}
}
