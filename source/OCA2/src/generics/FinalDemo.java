package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import wbs.collections.*a;

public class FinalDemo {
	
	
	public static <T,R> void m(List<T> values, Function<T, R> function) {
		for(T t : values) {
			R r = function.apply(t);
			System.out.println(r);
		}
	}
	
	public static <T> int meth(List<T> cls, Predicate<T> pred) {
		int n = 0;
		for(T t : cls ) {
			if(pred.test(t))
				n++;
		}
		
		return n;
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hier is ";
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		/*
		 * m(list, t -> { System.out.print(s1 + t + ":"); return t*t; });
		 * 
		 * 
		 * 
		 * List<String> strings = Arrays.asList("one","two","three","four","five");
		 * 
		 * m(strings, s -> { return "Length of " + s + " is " + s.length(); });
		 */
		
		List<Integer> zahlen = new ArrayList<Integer>();
		IntStream.rangeClosed(100, 999).forEach(zahl->zahlen.add(zahl));
		System.out.println(meth(zahlen, zahl -> Prim.primfaktoren(zahl).size() == 3));
		
	}

}
