package wbs.util;

public class C21 {

	 

    void m() {

    }

   

    public static void main(String[] args) {

         C21 c21 = new C21() {

               void m2() {

                   

               }

         };

         (C21) c21.m2();  // 1

    }

}