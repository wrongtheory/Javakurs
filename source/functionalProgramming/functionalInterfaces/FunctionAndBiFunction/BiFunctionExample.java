package functionalProgramming.functionalInterfaces.FunctionAndBiFunction;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer, Integer, String> bifunction = (x,y) -> x + " si " + y;
		BiFunction<Integer, Integer, String> string = (q,w) -> q.toString() + w.intValue();
		System.out.println(string.apply(1, 2));
		
		String result = bifunction.apply(3, 4);
		System.out.println(result);
		
		BiFunction<Integer, Integer, Integer> sum = (a,b) -> a + b;
		
		System.out.println("sum = " + sum.apply(4, 5));

	}

}
