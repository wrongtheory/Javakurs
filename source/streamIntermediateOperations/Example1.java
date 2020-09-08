package streamIntermediateOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// filter()
		Stream<String> s = Stream.of("monkey","gorilla", "bonobo");
		
		s.filter(x -> x.startsWith("m")).forEach(System.out::print);
		System.out.println();
		
		//distinct()
		Stream<String> s2 = Stream.of("duck", "duck", "duck","goose");
		s2.distinct().forEach(System.out::print);
		System.out.println();
		
		// limit() and skip()
		Stream<Integer> s3 = Stream.iterate(1,  n->n+1);
		s3.skip(5).limit(2).forEach(System.out::print);
		System.out.println();
		
		// map()
		Stream<String> s4 = Stream.of("monkey","gorilla","bonobo");
		s4.map(x -> x.length()).forEach(System.out::print);
		
		
		//flatMap()
		List<String> zero = Arrays.asList();
		List<String> one  = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero,one,two);
		
		animals.flatMap(l -> l.stream()).forEach(System.out::println);
		
		//sorted()
		Stream<String> s5 = Stream.of("brown-","bear-");
		s5.sorted().forEach(System.out::println);
		
		Stream<String> s6 = Stream.of("brown bear-", "grizzly-");
		s6.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
		//peek()
		Stream<String> stream = Stream.of("black bear","brown bear","grizzly");
		long count = stream.filter(t -> t.startsWith("g"))
				.peek(System.out::println).count();
		System.out.println(count);
		
		System.out.println("=============================================================");
		
		List<Integer> numbers = new ArrayList<Integer>();
		List<Character> letters = new ArrayList<>();
		
		numbers.add(1);
		letters.add('a');
		
		Stream<List<?>> stream2 = Stream.of(numbers,letters);
		stream2.map(List::size).forEach(System.out::println);
		
		StringBuilder builder = new StringBuilder();
		Stream<List<?>> good = Stream.of(numbers,letters);
		good.peek(l -> builder.append(1)).map(List::size).forEach(System.out::print);
		System.out.println(builder);
		
		Stream<List<?>> bad = Stream.of(numbers,letters);
		bad.peek(l -> l.remove(0)).map(List::size).forEach(System.out::print);
		
		
		
		
		
	}

}
