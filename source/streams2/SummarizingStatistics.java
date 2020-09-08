package streams2;

import java.util.IntSummaryStatistics;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.stream.IntStream;

public class SummarizingStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(range(IntStream.of(1)));
		
		
		BooleanSupplier b1 = () -> true;
		BooleanSupplier b2 = () -> Math.random() > .5;
		
		System.out.println(b1.getAsBoolean());
		System.out.println(b2.getAsBoolean());
		
		double d = 1.0;
		DoubleToIntFunction f1 = x -> 1;
		int i = f1.applyAsInt(d);
		System.out.println(i);

	}
	
	private static int range(IntStream ints) {
		IntSummaryStatistics stats = ints.summaryStatistics();
		if(stats.getCount() == 0) throw new RuntimeException();	
		
		return stats.getMax() - stats.getMin();
	}

}
