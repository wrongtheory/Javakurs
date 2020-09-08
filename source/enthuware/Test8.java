package enthuware;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test8 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Stream<Integer> strm1 = Stream.of(2,3,5,7,11,13,17,19);
		//Stream<Integer> strm2 = strm1.filter(i -> {return i > 5 && i < 15;});
		//Stream<Integer> strm2 = strm1.parallel().filter(i -> i> 5).filter(i -> i < 15).sequential();
		Stream<Integer> strm2 = strm1.collect(Collectors.partitioningBy(i -> {return i>5 && i < 15;})).get(true).stream();
		strm2.forEach(System.out::println);
		
	}

}
