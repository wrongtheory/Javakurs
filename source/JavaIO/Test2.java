package JavaIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		PrintWriter out = new PrintWriter("zoo.log");
		out.print(5);
		out.write(String.valueOf(5));
		
		out.print(2.0);
		
		out.write(String.valueOf(2.0));
		
		System.out.println("hz");
		
		Animal animal = new Animal();
		out.print(animal);
		out.write(animal == null ? "null" : animal.toString());
		
		System.getProperty("line.separator");

	}

}
