package JavaIO.tests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Frage27 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Writer w = new FileWriter("C:/data/destination.txt");
		
		try(BufferedWriter bw = new BufferedWriter(w)){
			bw.write("Blue");
		} finally {
			//w.flush();
			w.close();
		}
		System.out.println("Done!");

	}

}
