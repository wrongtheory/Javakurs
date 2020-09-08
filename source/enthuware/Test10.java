package enthuware;

import java.util.stream.IntStream;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object v1 = IntStream.rangeClosed(10, 15)
				//.boxed()
				.filter(x->x>12)
				.parallel()
				.findAny();

		Object v2 = IntStream.rangeClosed(10, 15)
				//.boxed()
				.filter(x->x>12)
				.sequential()
				.findAny();
		
		System.out.println(v1+" : " + v2);
		
	}

}
