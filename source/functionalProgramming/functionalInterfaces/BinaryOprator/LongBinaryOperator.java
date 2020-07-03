package functionalProgramming.functionalInterfaces.BinaryOprator;

public class LongBinaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.function.LongBinaryOperator lgbop = (a,b) -> a+b;
		System.out.println(lgbop.applyAsLong(3, 5));

	}

}
