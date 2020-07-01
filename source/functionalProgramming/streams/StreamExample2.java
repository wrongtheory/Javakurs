package functionalProgramming.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> cats = new ArrayList<>();
		
		cats.add("Annie");
		cats.add("Ripley");
		Stream<String> stream = cats.stream();
		cats.add("KC");
		System.out.println(stream.count());
		
		

	}
	
	private static void threeDigit(Optional<Integer> optional) {
		if(optional.isPresent()) {
			Integer num = optional.get();
			String string = "" + num;
			if(string.length() == 3)
			System.out.println(string);
		}
	}
	
	private static void threeDigit2(Optional<Integer> optional) {
		optional.map(n -> "" + n)
		.filter(s -> s.length() == 3)
		.ifPresent(System.out::println);
	}

}
