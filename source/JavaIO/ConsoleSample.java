package JavaIO;

import java.io.Console;
import java.io.IOException;
import java.io.Serializable;
import java.util.Locale;

public class ConsoleSample implements Serializable{
	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		Console console = System.console();
		
		console.writer().format(new Locale("fr", "CA"), "Hello World");
		
		if(console != null) {
			String userInput = console.readLine();
			console.writer().println("You entered following: " + userInput);
		}

	}

}
