package handlingExceptions;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			doSomething();
		}catch(RuntimeException e) {
			System.out.println(e);
		}
	}
	
	static void doSomething() {
		int[] array = new int[4];
		array[4] = 4;
		doSomethingElse();
	}

	static void doSomethingElse() {
		throw new RuntimeException();
	}
	
}
