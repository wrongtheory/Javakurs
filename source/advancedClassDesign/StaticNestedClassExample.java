package advancedClassDesign;

// static nested class

// A static nested class is a static class defined at the member level
// It can be instantiated without an object of the enclosing class, so it can't access the instance variables without an explicit object of the enclosing class. 

// - The nesting creates a namespace beacuse the enclosing class name must be used to refer to it
// - It can be made private or use one of the other access modifiers to encapsulate it
// - The enclosing class can refer to the fields and methods of the static nested class

public class StaticNestedClassExample {
	
	private final short f = 2;
	
	private static class T{
		int i = 1;
		static int j = f;
	}
	
	static interface Exp{}
	
	int a = 1;
	
	public void access() {
		int b = 2;
	}
	
	static private class Nested extends StaticNestedClassExample implements Runnable{
		private int price = 6;
		
		public static void test() {
			int i=1;
			//static int j = 2;
		}
		
		public void access() {
			System.out.println(new StaticNestedClassExample().a);
			System.out.println();
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	}
	
	private abstract class AbstractExample{
		public void access() {
			System.out.println(a);
		}
	}
	
	private final class FinalClass{}
	
	private static void drive() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested nested = new Nested();
		System.out.println(nested.price);
		
	}

}
