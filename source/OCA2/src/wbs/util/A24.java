package wbs.util;

interface I24<T extends CharSequence> {

    T  m();

}



public class A24 {



    public static void main(String[] args) {

        I24<CharSequence> i24 = new I24<CharSequence>() { 

             @Override

             public XXX m() {

                  return new XXX (); 

             }

        };

        System.out.println(i24.getClass());

    }

}