package functionalProgramming.functionalInterfaces;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToDoubleFunction<Integer> todouble = x -> x;
		System.out.println(todouble.applyAsDouble(9));

	}

}
