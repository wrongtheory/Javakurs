package JavaIO.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Frage18 {
	
	public void readMusic(File f) throws IOException {
		try(BufferedReader r = new BufferedReader(new FileReader(f))) {
			String music = null;
			try {
				while((music = r.readLine()) != null)
					System.out.println(music);
			} catch (IOException e) {}
		}catch(FileNotFoundException e) {
			throw new RuntimeException(e);
		} finally {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
