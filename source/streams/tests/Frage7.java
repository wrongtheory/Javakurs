package streams.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Frage7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Double> list = new ArrayList<>();
		list.add(5.4);
		list.add(1.2);
		
		Optional<Double> opt = list.stream().sorted().findFirst();
		System.out.println(opt.get() + " " + list.get(0));

	}

}
