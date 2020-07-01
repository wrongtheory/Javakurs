package bauprufung3;

public class C20 {

    String s = "abc";

    void m() {

          s.concat("def");

    }

    public static void main(String args[]) {

          C20 c20 = new C20();

          c20.m();

          System.out.println(c20.s);

    }

}