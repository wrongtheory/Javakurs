package functionalProgramming;

import java.util.Optional;

public class OptionalExample {

	public static Optional<Double> average(int...scores){
		if(scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for(int score : scores)
			sum+=score;
		return Optional.of((double) sum / scores.length);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(average(90,100));
		System.out.println(average());
		
		Optional<Double> opt = average(90,100);
		if(opt.isPresent())
			System.out.println(opt.get());
		
		Optional<Double> opt2 = average();
		//System.out.println(opt2.get());
		
		Optional o = (opt2 == null) ? Optional.empty() : Optional.of(opt2);
		
		Optional o2 = Optional.ofNullable(opt2);
		
		Optional<Double> a = average(90,100);
		a.ifPresent(System.out::println);
		
		
		Optional<Double> b = average();
		System.out.println(b.orElse(Double.NaN));
		System.out.println(b.orElseGet(() -> Math.random()));
		
		try {
			System.out.println(b.orElseThrow( () -> new IllegalStateException()));
		}catch(IllegalStateException e) {
			System.out.println("Exception");
		}
		
		System.out.println("Nach Exception");
	}

}
