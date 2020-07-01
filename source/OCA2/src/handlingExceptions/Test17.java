package handlingExceptions;

class MyException extends Exception{}

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test17 tc = new Test17();
		
		try {
			tc.m1();
		}catch(MyException e) {
			tc.m1();
		}finally {
			tc.m2();
		}
	}
	
	
	public void m1() throws MyException{
		throw new MyException();
	}
	
	public void m2() throws RuntimeException {
		throw new NullPointerException();
	}

}
