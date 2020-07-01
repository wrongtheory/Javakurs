package bauprufung3;

public class C14 {

    static StringBuffer sb = new StringBuffer();

    {

          sb.append("a");

    }

    {

          sb.append("b");

    }

    C14() {

          sb.append("c");

          throw new RuntimeException();

    }

    static {

          sb.append("d");

    }

    C14(int n) {

          this();

          sb.append(1);

         

    }

    public String toString() {

          return sb.toString();

    }

    public static void main(String...strings) {

          System.out.println(new C14((int) Math.PI));

    }

}