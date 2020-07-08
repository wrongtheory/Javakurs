package streams.tests;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Frage13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream pages = IntStream.of(200,300);
		IntSummaryStatistics stats = pages.summaryStatistics();
		
		long total = stats.getSum();
		long count = stats.getCount();
		System.out.println(total + " " + count);

	}

}
