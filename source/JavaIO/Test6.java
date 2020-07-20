package JavaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Test6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		OutputStream outputStream = new FileOutputStream("C:/data/destination.txt");
		
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream,"UTF-8");
		
		char[] chars = new char[] {'a','b'};
		
		outputStreamWriter.write(chars);
		
		outputStreamWriter.close();
		
		FileWriter fileWriter = new FileWriter("C:/data/destination.txt",true);
		
		fileWriter.write(" File Writer");
		
		fileWriter.flush();
		
		fileWriter.close();

	}

}
