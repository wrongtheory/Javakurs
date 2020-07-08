package streams.youtube;

import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
	
	
	public static int getSum(Stream<Integer> s) {
		int[] sum = new int[1];
		s.forEach(i -> sum[0] +=i);
		return sum[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v = Stream.iterate(1, i -> i + 1)
				.filter(i -> i % 2 == 0)
				.findFirst().get();
		
		System.out.println(v);
		
		
		IntStream.range(0, 100)
			.forEach(System.out::println);
		
		Iterator<Integer> stream = Stream.iterate(0,  i -> i + 1)
				.limit(100)
				.iterator();
		
		
		//while(stream.hasNext())
			//System.out.println(stream.next());
		
		
		Stream<Integer> s = IntStream.range(0, 100)
				.mapToObj(i -> 1).parallel();
		
		System.out.println(getSum(s));
		
		
			int s2 = Stream.of(1,2,3)
			.reduce(0, (x,y) -> x + y);
			System.out.println(s2);
				
			
			
			Integer i = new Integer(1);
	}

}
