package wbs.util;

public class A33 {

	 

    void m() {

    }

   

    public static void main(String[] args) {

        A33 c22 = new A33() {

             void m() {

                  System.out.println(args);

             }

        };

         //args = new String[3];

    }

}