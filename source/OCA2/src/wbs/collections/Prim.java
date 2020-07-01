package wbs.collections;

import java.util.ArrayList;
import java.util.List;

public class Prim {
	
	
	public static List<Integer> primfaktoren(int zahl) 
            throws IllegalArgumentException {
    if (zahl < 1) {
            throw new IllegalArgumentException(
                            "invalid argument: zahl must be greater than zero");
    }
    List<Integer> result = new ArrayList<>();
    for (int teiler = 2; zahl != 1; teiler++) {
            for (; zahl % teiler == 0; zahl /= teiler) {
                    result.add(teiler);
            }
    }
    return result;
}

public static void main(String[] args) {
	System.out.println(primfaktoren(2));
}
	

}
