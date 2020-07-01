package bauprufung3;

class C391 {

    int m() {

          return 3;

    }

}



public class C39 extends C391{

   

    static int m() {

          return 4;

    }



    public static void main(String[] args) {

          C391 c391 = new C39();

          System.out.println(c391.m());

    }



}
