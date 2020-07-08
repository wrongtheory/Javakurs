package streams.tests;

import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class Frage26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongStream stream = LongStream.of(6,10);
		LongSummaryStatistics stats = stream.summaryStatistics();
		System.out.println(stats.getAverage());

	}

}
