package handlingExceptions;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			m1();
		}catch(IndexOutOfBoundsException e) {
			System.out.println("1");
			throw new NullPointerException();
		}catch(NullPointerException e) {
			System.out.println("2");
			return;
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		System.out.println("end");
	}
	
	static void m1() {
		System.out.println("m1 Starts");
		throw new IndexOutOfBoundsException("Big Bang");
	}

}
