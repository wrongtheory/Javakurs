package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class fileStreamTest {
	
	public static void main(String[] args) throws IOException {
		
		try {
			byte bWrite [] = {11,21,3,40,5};
			OutputStream os = new FileOutputStream("C:/data/source.txt");
			
			for(int x = 0; x < bWrite.length; x++)
				os.write(x);
			os.close();
			
			InputStream is = new FileInputStream("C:/data/source.txt");
			int size = is.available();
			
			for(int i = 0; i < size; i++) {
				System.out.println((char)is.read() + " ");
			}
			is.close();
		} catch(IOException e) {
			System.out.println("Exception");
		}
		
	}

}
