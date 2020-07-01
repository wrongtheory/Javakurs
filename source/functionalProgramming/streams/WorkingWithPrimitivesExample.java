package functionalProgramming.streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class WorkingWithPrimitivesExample {

	public static void main(String[] args) {
		
		
		Stream<Integer> stream = Stream.of(1,2,3);
		System.out.println(stream.reduce(0, (s,n) -> s + n));
		
		Stream<Integer> stream2 = Stream.of(1,2,3);
		System.out.println(stream2.mapToInt(x -> x).sum());
		
		IntStream intStream = IntStream.of(1,2,3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());
		
		DoubleStream empty = DoubleStream.empty();
		
		DoubleStream oneValue = DoubleStream.of(3.14);
		DoubleStream varargs = DoubleStream.of(1.0,1.1,1.2);
		oneValue.forEach(System.out::println);
		System.out.println();
		varargs.forEach(System.out::println);
		
		
		DoubleStream random = DoubleStream.generate(Math::random);
		DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
		
		random.limit(3).forEach(System.out::println);
		System.out.println();
		fractions.limit(3).forEach(System.out::println);
		
		
		IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
		count.forEach(System.out::println);
		
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		
		IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::println);
		
		Stream<String> objStream = Stream.of("penguin","fish");
		IntStream intStr = objStream.mapToInt(s -> s.length());
		
		IntStream st = IntStream.rangeClosed(1, 10);
		OptionalDouble optional = st.average();
		System.out.println(optional.getAsDouble());
		
		
		optional.ifPresent(System.out::println);
		System.out.println(optional.getAsDouble());
		System.out.println(optional.orElseGet(() -> Double.NaN));
		
		
		LongStream longs = LongStream.of(5, 10);
		long sum = longs.sum();
		System.out.println(sum);
		
		DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
		//OptionalDouble min = doubles.min();
		

	}
	

}
