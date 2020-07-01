package handlingExceptions;

public class TestClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.exit(0);
		}
		finally {
			System.out.println("finally is always executed");
		}
	}

}
