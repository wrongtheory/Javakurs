package bauprufung3;

public class C21 {

    StringBuffer s = new StringBuffer("fedcba");

    void m() {

          s.reverse();

    }

    public static void main(String args[]) {

          C21 c20 = new C21();

          c20.m();

          System.out.println(c20.s);

    }

}