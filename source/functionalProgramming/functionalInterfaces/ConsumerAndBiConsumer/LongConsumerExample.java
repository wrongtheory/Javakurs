package functionalProgramming.functionalInterfaces.ConsumerAndBiConsumer;

import java.util.function.LongConsumer;

public class LongConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongConsumer longcons = x -> System.out.println(x+10);
		longcons.accept(10);

	}

}
