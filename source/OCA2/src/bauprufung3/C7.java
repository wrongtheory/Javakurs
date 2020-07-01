package bauprufung3;

class E71 extends Exception {

    

}

 

public class C7  {

      static {

            if (Math.random() > 0.5) {

                  throw new E71();

            }

      }

 

      C7() throws Exception {

 

      }

}

 

class C71 extends C7 {

      C71() throws Throwable {

           

      }

 

}