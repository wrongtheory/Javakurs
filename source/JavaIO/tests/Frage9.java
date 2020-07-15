package JavaIO.tests;

import java.io.FileInputStream;
import java.io.InputStream;

public class Frage9 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		try(InputStream is = new FileInputStream("C:\\data\\source.txt")){
			is.skip(1);
			is.read();
			is.skip(1);
			is.read();
			is.mark(4);
			is.skip(1);
			is.reset();
			System.out.println(is.read());
		}

	}

}
