package JavaIO;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

public class ConsoleReadInputSample {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		
		Console console = System.console();
		if(console == null) {
			throw new RuntimeException("Console not available");
		} else {
			console.writer().print("How excited are you about your trip today? ");
			console.flush();
			
			String excitementAnswer = console.readLine();
			
			String name = console.readLine("Please enter your name: ");
			Integer age = null;
			
			console.flush();
			BufferedReader reader = new BufferedReader(console.reader());
			String value = reader.readLine();
			
			console.writer().print("What is your age? ");
			char[] password = console.readPassword("Enter your password: ");
			console.format("Enter your password again: ");
			console.flush();
			
			char[] verify = console.readPassword();
			
			boolean match = Arrays.equals(password, verify);
			
			for(int i = 0; i < password.length; i++) {
				password[i] = 'x';
			}
			
			for(int i = 0; i < verify.length; i++) {
				verify[i] = 'x';
			}
			
			console.format("Yout password was " + (match? "correct" : "incorect"));
			
			age = Integer.valueOf(value);
			console.writer().println();
			console.format("Your name is " + name);
			console.writer().println();
			console.format("Your age is " + age);
			console.printf("Your excitement level is: " + excitementAnswer);
			
		}

	}

}
