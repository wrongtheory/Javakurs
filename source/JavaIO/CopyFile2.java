package JavaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("C:/data/source.txt");
			out = new FileWriter("C:/data/destination.txt");
			
			int c;
			
			while((c = in.read()) != -1)
				out.write(c);
		} finally {
			if(in != null)
				in.close();
			if(out != null)
				out.close();
		}
		
	}

}
