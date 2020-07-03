package functionalProgramming.functionalInterfaces.ConsumerAndBiConsumer;

import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleConsumer doubl = x -> System.out.println(x*10);
		doubl.accept(5);

	}

}
