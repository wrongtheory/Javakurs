package JavaIO.tests;

import java.io.DataOutputStream;

import java.io.File;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.OutputStream;

 

public class C21 {

 

  public static void main(String[] args) throws IOException {

 

    File path1 = new File("resources/io/os.data");

    File path2 = new File("resources/io/dos_1.data");

    File path3 = new File("resources/io/dos_2.data");

 

    int n = Integer.MAX_VALUE;

 

    try (OutputStream os = new FileOutputStream(path1);

        DataOutputStream dos1 = new DataOutputStream(

            new FileOutputStream(path2));

        DataOutputStream dos2 = new DataOutputStream(

            new FileOutputStream(path3))) {

      os.write(n);

      dos1.write(n);

      dos2.writeInt(n);

     // os = null;

 

    }

 

    System.out.println(path1.length());

    System.out.println(path2.length());

    System.out.println(path3.length());

  }

}