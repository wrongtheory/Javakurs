package JavaIO;

import java.io.Console;
import java.io.IOException;

public class ConsoleSamplePrint {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		Console console = System.console();
		
		if(console == null)
			throw new RuntimeException("Console not available");
		else {
			console.writer().println("Welcome to our Zoo!");
			console.format("Our zoo has 391 animals and employs 25 people");
			console.writer().println();
			console.printf("The zoo spans 281.91 acres");
		}

	}

}
