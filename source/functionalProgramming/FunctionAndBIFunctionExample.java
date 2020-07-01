package functionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

// Function turn 1 parameter into 1 value
// BIFunction turn 2 paramaters into 1 value

interface TriFunction<T,U,V,R>{
	R apply(T t, U u, V v);
}

interface QuadFunction<T,U,V,W,R>{
	R apply(T t, U u, V v, W w);
}

public class FunctionAndBIFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		
		System.out.println(f1.apply("cluck"));
		System.out.println(f2.apply("Java"));
		
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(b1.apply("baby ", "chick"));
		System.out.println(b2.apply("baby ", "chick"));

	}

}
