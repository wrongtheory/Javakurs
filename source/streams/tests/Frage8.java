package streams.tests;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Frage8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream stream = IntStream.of(6,10);
		LongStream longs = stream.mapToLong(i -> i);
		System.out.println(longs.average().getAsDouble());

	}

}
