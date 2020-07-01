package bauprufung3;

public class C19 {

    CharSequence s = "abc";

    void m() {

          s.append("def");

    }

    public static void main(String args[]) {

          C19 c19 = new C19();

          c19.m();

          System.out.println(c19.s);

    }

}