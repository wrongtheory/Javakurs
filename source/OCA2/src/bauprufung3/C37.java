package bauprufung3;

class C371 {

    int n;

}



public class C37 extends C371 {

    int n;

   

    public static void main(String[] args) {

          C371 c371 = new C37();

          int n = c371.n + ((C37) c371).n;

          System.out.println(n);

    }

}