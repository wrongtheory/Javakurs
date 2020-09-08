package functionalProgramming2.consumerAndBiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Double> consDouble = System.out::print;
		consDouble.accept(3.0);
		
		Consumer<String> cs = x -> System.out.println(x);
		Consumer<Double> cd = y -> System.out.println(y.intValue());
		cd.accept(150.0);
		
		BiConsumer<String, String> bicons = (a,b) -> System.out.println(a.concat(b));
		
		bicons.accept("a","b");
		
		addTwo(1, 2, (x,y) -> System.out.println(x+y));
		addTwo("Node", ".js", (x,y) -> System.out.println(x+y));

		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Victor Leunti");
		map.put(2, "Tilo Abish");
		
		BiConsumer<Map<Integer, String>, String> bic = Consumer1::show;
		bic.accept(map, "Student");
		
	}
	
	
	static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c) {
			c.accept(a1, a2);
	}
	
	
	static void show(Map<Integer, String> map, String s) {
		System.out.println(s + " records: ");
		
		map.forEach((k,v) -> System.out.println(k+ " " + v));
	}

}
