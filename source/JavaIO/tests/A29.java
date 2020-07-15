package JavaIO.tests;

public class A29 {

    private String s;



    public A29(String s) {

                   this.s = s;

    }



    @Override

    public int hashCode() {

                   return 1;

    }



    @Override

    public boolean equals(Object obj) {

                   boolean result = false;

                   if (obj != null && obj instanceof A29) {

                                   A29 other = (A29) obj;

                                   int i;

                                   for (i = 0; i < s.length() && other.s.indexOf(s.charAt(i)) < 0; i++) {

                                   }

                                   result = (i < s.length());

                   }

                   return result;

    }



    public static void main(String[] args) {

                   A29 anton = new A29("anton");

                   A29 berta = new A29("berta");

                   A29 chris = new A29("chris");

                   System.out.println(anton.equals(anton));

                   System.out.println(anton.equals(berta));

                   System.out.println(berta.equals(anton));

                   System.out.println(berta.equals(chris));

                   System.out.println(chris.equals(berta));

                   System.out.println(anton.equals(chris));

    }

}