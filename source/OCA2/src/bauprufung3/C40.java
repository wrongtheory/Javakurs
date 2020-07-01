package bauprufung3;

class C400 {

    int m() {

          return 3;

    }

}



public class C40 extends C400{

   

    int m() {

          return 4;

    }



    public static void main(String[] args) {

          C400 c400 = new C40();

          System.out.println(c400.m());

    }



}