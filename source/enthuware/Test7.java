package enthuware;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test7 {
	
	static List<String> l1 = Arrays.asList("a","b");
	static List<String> l2 = Arrays.asList("1","2");

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stream.of(l1,l2).forEach((x) -> System.out.println(x));
		Stream.of(l1,l2).flatMap((x) -> Stream.of(x)).forEach((x) -> System.out.println(x));
		Stream.of(l1,l2).flatMap((x) -> x.stream()).forEach((x) -> System.out.println(x));
		
	}

}
