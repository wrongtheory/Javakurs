package JavaIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Reader reader = new BufferedReader(new FileReader("C:/data/source.txt"));
		
		char[] theChars = new char[128];
		
		int charsRead = reader.read(theChars, 0, theChars.length);
		
		while(charsRead != -1) {
			System.out.println(new String(theChars, 0, charsRead));
			charsRead = reader.read(theChars, 0, theChars.length);
		}
		
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/data/source.txt"));
		
		String line = bufferedReader.readLine();
		
		int i = 1;
		
		while(line != null) {
			System.out.println(line);
			bufferedReader.skip(i);
			
			line = bufferedReader.readLine();
			//i++;
		}
		
		bufferedReader.close();
		
		System.err.print("Error");

	}

}
