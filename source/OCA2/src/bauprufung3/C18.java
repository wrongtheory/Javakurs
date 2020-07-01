package bauprufung3;

import java.util.Arrays;

public class C18 {

      int m1(Iterable<Integer> c) {

            return 1;

      }

      void m2() {

            m1(Arrays.asList(Integer.valueOf(1)));

      }

}