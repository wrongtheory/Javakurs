package functionalProgramming.streams;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceExample {

	public static void main(String[] args) {
	
		String[] array = new String[] {"w","o","l","f"};
		
		String result ="";
		
		for(String s: array)
			result += s;
		
		//System.out.println(result);
		
		Stream<String> stream = Stream.of("w","o","l","f");
		String word = stream.reduce("", (s,c) -> s + c);
		//System.out.println(word);
		
		Stream<String> stream2 = Stream.of("w","o","l","f");
		String word2 = stream2.reduce("", String::concat);
		//System.out.println(word2);
		
		Stream<Integer> stream3 = Stream.of(1,2,3);
		//System.out.println(stream3.reduce(1,(a,b) -> a*b));
		//System.out.println(15*6);
		
		BinaryOperator<Integer> op = (a,b) -> a * b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(3,5,6);
		
		empty.reduce(op).ifPresent(System.out::print);
		oneElement.reduce(op).ifPresent(System.out::println);
		threeElements.reduce(op).ifPresent(System.out::println);
		
		
		BinaryOperator<Integer> opp = (a,b) -> a * b;
		Stream<Integer> stream4 = Stream.of(3,5,6);
		System.out.println(stream4.reduce(1,op,op));
	}

}
