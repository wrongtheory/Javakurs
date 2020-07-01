package exceptions;

public class Footbal {

	public static void main(String[] args) {
		
		try {
			System.out.println('A');
			throw new RuntimeException("Out of bounds");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println('B');
			throw e;
		} finally {
			System.out.println('C');
		}

	}

}
