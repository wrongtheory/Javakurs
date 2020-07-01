package functionalProgramming.tests;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frage11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Stream.iterate (1, x-> ++x).limit(5).map(x -> " "+ x).collect(Collectors.joining()));

	}

}
