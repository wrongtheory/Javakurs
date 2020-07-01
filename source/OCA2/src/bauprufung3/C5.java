package bauprufung3;

import java.math.BigInteger;



public class C5 {

      Number m() {

            return 1;

      }

}

 

class C51 extends C5 {

      Integer m(int n) throws Exception {

            return 2;

      }

 

      protected BigInteger m() throws RuntimeException {

            return BigInteger.TWO;

      }

 

}