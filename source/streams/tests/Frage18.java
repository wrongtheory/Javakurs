package streams.tests;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frage18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Boolean> bools = Stream.iterate(true, b -> !b);
		
		Map<Boolean, List<Boolean>> map = bools.limit(1)
				.collect(Collectors.partitioningBy(b -> b));
		
		System.out.println(map);

	}

}
