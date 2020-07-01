package bauprufung3;

public class C4 {

    Object m() {

          return 1;

    }

}



class C41 extends C4 {

    Integer m(int n) throws Exception {

          return 2;

    }

    Integer m() throws RuntimeException {

          return 2;

    }



}