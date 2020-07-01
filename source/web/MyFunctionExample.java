package web;

import java.util.function.Function;

public class MyFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> f = (x) -> x.length();
		Function<String, Integer> f2 = String::length;
		
		System.out.println(f.apply("Hallo"));
		System.out.println(f2.apply("Victor"));

	}

}
