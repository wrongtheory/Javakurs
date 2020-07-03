package functionalProgramming.functionalInterfaces.ConsumerAndBiConsumer;

import java.util.function.IntConsumer;

public class IntConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntConsumer intcons = x -> System.out.println(x);
		IntConsumer mul = a -> a *= 10;
		
		IntConsumer comp = intcons.andThen(mul);
		comp.accept(2);

	}

}
