package bauprufung3;

class C34 {

	 

    static CharSequence s = "abc";

   

    public static void main(String[] args) {

          System.out.println(s instanceof String);



    }

   

    static {

          s = s.getClass().getName();

    }



}