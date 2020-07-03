package functionalProgramming.functionalInterfaces.UnaryOperator;

public class LongUnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.function.LongUnaryOperator lngunop = x -> {
			return x * x * x;
		};
		
		System.out.println(lngunop.applyAsLong(5));

	}

}
