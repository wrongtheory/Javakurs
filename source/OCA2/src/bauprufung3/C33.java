package bauprufung3;

class C33 {

	 

    static String s = new Object().toString();

   

    public static void main(String[] args) {

          System.out.println(s instanceof String);



    }

   

    static {

          s = s.getClass().getName();

    }



}