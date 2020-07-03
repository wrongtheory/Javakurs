package functionalProgramming.functionalInterfaces;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToDoubleBiFunction<Integer, Integer> todouble = (x,y) -> x+y;
		System.out.println(todouble.applyAsDouble(1, 3));
		
		ToDoubleBiFunction<String, String> stringtodouble = (x,y) -> Double.valueOf(x) + Double.valueOf(y);
		System.out.println(stringtodouble.applyAsDouble("3", "4"));

	}

}
