package functionalProgramming.functionalInterfaces.ConsumerAndBiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiConsumer<Integer, Integer> bicons = (x,y) -> {
			if(x>y)
				System.out.println(x + " is max");
			else
				System.out.println(y + " is max");
		};
		
		bicons.accept(7, 8);

	}

}
