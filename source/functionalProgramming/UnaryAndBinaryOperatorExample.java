package functionalProgramming;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

// A UnaryOperator transforms its value into one of the same type. For example incrementing by one is a unary operation
// A BinaryOperator merge two values into one of the same type. Adding two numbers is a binary operation 

public class UnaryAndBinaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toLowerCase();
		
		System.out.println(u1.apply("AbCd"));
		System.out.println(u2.apply("AbCd"));
		
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(b1.apply("baby ", "chick"));
		System.out.println(b2.apply("baby", "chick"));

	}

}


// Supplier
// Function
// BIFunction, BinaryOperator

//Predicate
//Consumer
//BIPredicate