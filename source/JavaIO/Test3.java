package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStream in = new FileInputStream("C:\\data\\source.txt");
		
		byte [] data = new byte[1024];
		int bytes = in.read(data);
		
		while(bytes != -1) {
			
			for(int i=0;i<data.length;i++)
				System.out.print((char)i);
			
			bytes = in.read(data);
			
		}
		
		in.close();
	}

}
