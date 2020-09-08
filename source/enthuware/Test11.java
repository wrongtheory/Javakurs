package enthuware;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> letters = Arrays.asList("j","a","v","a");
		
		letters.forEach(letter -> letter.toUpperCase());
		letters.forEach(System.out::print);
		
		UnaryOperator<String> uo = str->str.toUpperCase();
		letters.replaceAll(uo);
		letters.forEach(System.out::print);
		
		letters.forEach(letter->System.out.print(letter.toUpperCase()));
		
		System.out.println(letters.stream().collect(Collectors.joining()).toUpperCase());
		
		
	}

}
