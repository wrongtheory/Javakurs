package bauprufung3;

public class C10 {

    void m1() throws IndexOutOfBoundsException {

         

    }

    void m2() throws RuntimeException {

         

    }

   

    void m3() {

          try {

                m1();

                m2();

          }

          catch(NumberFormatException | Error e) {

               

          }

    }

}
