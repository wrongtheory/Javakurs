package bauprufung3;

import java.util.Comparator;

public class C26 implements Comparator<C26> {

	 

    @Override

    public int compare(C26 o1, C26 o2) {

          return o1.hashCode() - o2.hashCode();

    }

}