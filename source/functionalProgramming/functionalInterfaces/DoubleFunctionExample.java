package functionalProgramming.functionalInterfaces;

import java.util.function.DoubleFunction;

public class DoubleFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleFunction<Integer> doubl = x -> (int)x * 10;
		System.out.println(doubl.apply(4.0));
	}

}
