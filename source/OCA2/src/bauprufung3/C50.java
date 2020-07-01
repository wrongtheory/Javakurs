package bauprufung3;



import java.util.Arrays;



class C500 implements Comparable<C500> {

 

      public int compareTo(C500 o) {

            return 0;

      }

}

 

public class C50 {

 

      public static void main(String[] args) {

            Arrays.sort(new Object[] { new C500(), new C500() });

      }

}