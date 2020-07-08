package streams.tests;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Frage19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();
		set.add("tire-");
		
		List<String> list = new LinkedList<>();
		
		Deque<String> queue = new ArrayDeque<String>();
		queue.push("wheel-");
		
		Stream.of(set,list,queue)
			.flatMap(x -> x.stream())
			.forEach(System.out::print);

	}

}
