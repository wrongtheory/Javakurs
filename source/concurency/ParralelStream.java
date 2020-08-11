package concurency;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParralelStream {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
		Stream<Integer> parallelStream = stream.parallel();
		
		Stream<Integer> parralel = Arrays.asList(1,2,3,4,5,6).parallelStream();
		
		int[] i = new int[100_000_000];

		
		for(int n = 0; n < i.length; n++)
			i[n] = n;
		
		//for(int k: i)
			//System.out.println(k);
			
		long t = System.currentTimeMillis(); 
				
		Arrays.asList(i)
			.stream()
			.forEach(s->System.out.print(s + " "));
		long end = System.currentTimeMillis()-t;

		
		System.out.println();
		
		long t2 = System.currentTimeMillis(); 
		
		Arrays.asList(i)
		.parallelStream()
		.forEach(s->System.out.print(s + " "));
		long end2 = System.currentTimeMillis()-t2;
		
		System.out.println();
		
		System.out.println("time1 "+ end);
		System.out.println("time2 "+ end2);
	}

}
