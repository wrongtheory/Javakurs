package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("C:/data/source.txt");
			out = new FileOutputStream("C:/data/destination.txt");
			
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
