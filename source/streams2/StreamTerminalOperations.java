package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//count
		Stream<String> s = Stream.of("monkey","gorilla","bonobo");
		System.out.println(s.count());
		
		// min and max
		Stream<String> s22 = Stream.of("monkey1","gorilla","bonobo");
		Optional<String> min = s22.min((s1,s2) -> s1.length() - s2.length());
		min.ifPresent(System.out::println);
		
		Optional<?> minEmpty = Stream.empty().min((s1,s2) -> 0);
		System.out.println(minEmpty.isPresent());
		
		// findAny()and findFirst()
		Stream<String> s3 = Stream.of("monkey","gorilla","bonobo");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		s3.findAny().ifPresent(System.out::println);
		infinite.findAny().ifPresent(System.out::println);
		
		//allMatch(), anyMatch(), noneMatch()
		List<String> list = Arrays.asList("monkey","2","chimp");
		Stream<String> infinite2 = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(list.stream().anyMatch(pred));
		System.out.println(list.stream().allMatch(pred));
		System.out.println(list.stream().noneMatch(pred));
		System.out.println(infinite2.anyMatch(pred));
		
		
		//forEach()
		Stream<String> s4 = Stream.of("monkey","gorilla","bonobo");
		s4.forEach(System.out::println);
		
		//reduce
		String[] array = new String[] {"w","o","l","f"};
		String result = "";
		for(String str:array) result+=str;
		System.out.println(result);
		
		Stream<String> stream = Stream.of("w","o","l","f");
		String word = stream.reduce("", (sou,c) -> sou+c);
		System.out.println(word);
		
		Stream<String> stream2 = Stream.of("w","o","l","f");
		String word2 = stream2.reduce("", String::concat);
		System.out.println(word2);
		
		Stream<Integer> stream3 = Stream.of(3,5,6);
		System.out.println(stream3.reduce(1, (a,b) -> a*b));
		
		BinaryOperator<Integer> op = (a,b) -> a * b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(3,5,6);
		
		empty.reduce(op).ifPresent(System.out::println);
		oneElement.reduce(op).ifPresent(System.out::println);
		threeElements.reduce(1,op,op);//.ifPresent(System.out::println);
		
		//collect
		Stream<String> stream4 = Stream.of("w","o","l","f");
		StringBuilder word3 = stream4.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(word3);
		
		Stream<String> stream5 = Stream.of("w","o","l","f");
		TreeSet<String> set = stream5.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set);
		
		Stream<String> stream6 = Stream.of("w","o","l","f");
		TreeSet<String> set2 = stream6.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set2);
		
		Stream<String> stream7 = Stream.of("w","o","l","f");
		Set<String> set3 = stream7.collect(Collectors.toSet());
		System.out.println(set3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
