package ExceptionsAndAssertions;

import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Assertions{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		int num = -5;
		//assert (num > 0: "");
		System.out.println(num);
		//boolean assert = false;
		
		if(num<5) assert false;
	
		
		File file = null;
		try(FileWriter f = new FileWriter(file))
			
		
	

		{}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
