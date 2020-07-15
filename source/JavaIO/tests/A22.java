package JavaIO.tests;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A22 {

	 

    public static void main(String[] args) throws IOException {

                   Path p11 = Paths.get("C://data/source.txt");

                   Path p21 = Paths.get("C://data/source.txt");

                   Path p12 = p11.toRealPath();

                   Path p22 = p21.toAbsolutePath();

                   System.out.println(p12);

                   System.out.println(p22);

                   System.out.println(p12.equals(p22));

    }

}

