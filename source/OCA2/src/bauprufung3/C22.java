package bauprufung3;

class E221 extends Exception {

	 

}

 

class E222 extends Exception {

      E222() {

            this(new E221());

      }

}

 

public class C22 {

      void m1() throws E221 {

 

      }

 

      void m2() throws E222 {

 

      }

 

      void m3() throws E221, E222 {

            try {

                  C22 c22 = new C22();

                  c22.m1();

                  c22.m2();

            } catch (Exception e) {

                  throw e;

            }

      }

}