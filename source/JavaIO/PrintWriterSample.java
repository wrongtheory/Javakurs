package JavaIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File source = new File("C:\\data\\source.txt");
		
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(source)))){
			out.print("Today's wether is: ");
			out.println("Sunny");
			out.print("Today's temperature at the zoo is: ");
			out.print(1/3.0);
			out.println('C');
			out.format("It has rained 10.12 inches this year");
			out.println();
			out.printf("It may rain 21.2 more inches this year");
		}

	}

}
