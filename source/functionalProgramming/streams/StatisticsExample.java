package functionalProgramming.streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StatisticsExample {

	public static void main(String[] args) {
			System.out.println(max(IntStream.of(1,2,3)));
			System.out.println(range(IntStream.of(1,2,3)));
	}
	
	private static int max(IntStream ints) {
		OptionalInt optional = ints.max();
		return optional.orElseThrow(RuntimeException::new);
	}
	
	private static int range(IntStream ints) {
		IntSummaryStatistics stats = ints.summaryStatistics();
		if(stats.getCount() == 0)
			throw new RuntimeException();
		return stats.getMax() - stats.getMin();
	}


}
