package functionalProgramming.streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StatisticsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
