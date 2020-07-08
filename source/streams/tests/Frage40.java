package streams.tests;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Frage40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new LinkedList<>();
		Deque<String> queue = new ArrayDeque<String>();
		
		queue.push("all queued up");
		queue.push("last");
		
		withFlatMap(list);
		withoutFlatMap(list);
		
		withFlatMap(queue);
		withoutFlatMap(queue);

	}
	
	private static void withFlatMap(Collection<?> coll) {
		Stream.of(coll)
		.flatMap(x -> x.stream())
		.map(x -> x)
		.forEach(System.out::println);
		System.out.println();
	}
	
	private static void withoutFlatMap(Collection<?> coll) {
		Stream.of(coll)
		.filter(x -> !x.isEmpty())
		.map(x -> x)
		.forEach(System.out::println);
		System.out.println();
	}

}
