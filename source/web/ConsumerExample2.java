package web;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerExample2 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("a","bb","ccc","dddd");
		List<Integer> ints = Arrays.asList(1,2,3,4,5);
		
		Consumer<String> cons = (String s) -> System.out.print(s + " ");
		Consumer<String> cons2 = (String s) -> System.out.print(s.length() + " ");
		
		Consumer<Integer> cons3 = s -> System.out.print(s + " ");
		Consumer<Integer> cons4 = s -> System.out.print(s*s + " ");
		
		Predicate<Integer> p = x -> x%2 ==0;
		
		Supplier<String> st = String::new;
		System.out.println(st.get());
		
		
		
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		Supplier<StringBuilder> t2 = () -> new StringBuilder();
		
		Supplier<ArrayList<String>> al1 = ArrayList<String>::new;
		
		consum(list, cons);System.out.println();
		consum(list, cons2);System.out.println();
		consum(ints, cons3);System.out.println();
		consum(ints, cons4);System.out.println();
		
		for(int i=0; i< ints.size();i++)
			System.out.println(ints.get(i) + " % 2 = " + p.test(ints.get(i)));

	}

	
	public static <T> void consum(List<T> list, Consumer<T> consumer) {
		for(T t: list)
			consumer.accept(t);
	}
	
}
