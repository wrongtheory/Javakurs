package JavaIO.tests;

public class Gespaltener {

    

    Gespaltener gespaltener;



    @Override

    public boolean equals(Object obj) {

                   boolean result = false;

                   if (obj != null && obj instanceof Gespaltener) {

                                   Gespaltener gespaltener = (Gespaltener) obj;

                                   result = (this.gespaltener == gespaltener

                                                                   && gespaltener.gespaltener == this);

                   }

                   return result;

    }



    @Override

    public int hashCode() {

                   return 1;

    }



    public static void main(String[] args) {

                   Gespaltener jekyll = new Gespaltener();

                   Gespaltener hyde = new Gespaltener();

                   jekyll.gespaltener = hyde;

                   hyde.gespaltener = jekyll;

                   System.out.println(jekyll.equals(hyde));

                   System.out.println(hyde.equals(jekyll));

                   System.out.println(jekyll.equals(jekyll));

                   System.out.println(hyde.equals(hyde));

    }

}