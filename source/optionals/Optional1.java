package optionals;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(average(1,2,3).get());
		System.out.println(average());
		
		Optional<Double> opt = average(90,100);
		if(opt.isPresent())
			System.out.println(opt.get());
		
		opt.ifPresent(System.out::println);
		
		Optional<Double> opt2 = average();
		
		System.out.println(opt2.orElse(Double.NaN));
		System.out.println(opt2.orElseGet(() -> Math.random()));
		System.out.println(opt2.orElseThrow(() -> new IllegalStateException()));
		
	}
	
	
	public static Optional<Double> average(int...scores) {
		if(scores.length == 0)
			return Optional.empty();
		int sum = 0;
		
		for(int score: scores) sum+=score;
		
		return Optional.of((double) sum / scores.length);
	}

}
