package JavaIO.tests;

import java.nio.file.Path;

import java.nio.file.Paths;

 

public class C34 {

 

                public static void main(String[] args) {

                               Path path = Paths.get("resources", "io", "xyz.txt");

                               System.out.println(path.getFileName());

                }

}