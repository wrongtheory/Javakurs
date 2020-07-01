package genericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {

		Gen<String> g1 = new Gen<String>("generics String");
		g1.show();
		System.out.println(g1.getObj());
		
		Gen<Integer> g2 = new Gen<Integer>(10);
		g2.show();
		System.out.println(g2.getObj());
		
		
		Gen<Double> g3 = new Gen<Double>(10.0);
		g3.show();
		System.out.println(g3.getObj());
	}

}
