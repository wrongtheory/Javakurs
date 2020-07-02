package web;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> predicate = (s) -> s.length() > 0;
		
		System.out.println(predicate.test("foo"));
		System.out.println(predicate.negate().test("foo"));
		
		Predicate<Boolean> nonNull = Objects::nonNull;
		Predicate<Boolean> isNull = Objects::isNull;
		
		System.out.println(nonNull.negate());
		System.out.println(isNull);
		
		Predicate<String> isEmpty = S
		Predicate<String> isNonEmpty = isEmpty.negate();tring::isEmpty;
		
		System.out.println(isEmpty.test(""));
		System.out.println(isNonEmpty.test("1"));
		
		
		
	}

}
