package tag1;

import static java.lang.Integer.parseInt;

final class A{}

public class Unchecked1Demo {

	public static void main(String[] args) throws NumberFormatException,ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		int sum = parseInt(args[0])+parseInt(args[2]);
		
		System.out.println(sum);
		
		A a = new A();

	}

}
