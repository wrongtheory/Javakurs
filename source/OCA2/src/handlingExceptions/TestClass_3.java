package handlingExceptions;

public class TestClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		amethod();
		System.out.println("try ");
	} catch(Exception e) {
		System.out.println("catch ");
	}finally {
		System.out.println("finally ");
	}
	System.out.println("out ");
		
	}

	public static void amethod() {}
	
}
