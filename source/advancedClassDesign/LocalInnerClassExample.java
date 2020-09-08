package advancedClassDesign;

// Local Inner Class

// A local inner class is a nested class defined within a method
// Local inner classes have the following properties:

// - They do not have an access specifier
// - They cannot be declared static and cannot declare static fields or methods
// - They have access to all fields and methods of the enclosing class

public class LocalInnerClassExample {
	
	private int length = 5;
	
	public void calculate() {
		final int width = 20;
		
		class Inner extends Thread implements Runnable {
			
		
			
			public void multiply() {
				System.out.println(length * width);
			}
		}
		
		abstract class Example{
			
		}
		
		final class FinalExample{}
		
		Inner inner = new Inner();
		inner.multiply();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LocalInnerClassExample outer = new LocalInnerClassExample();
			outer.calculate();
			
			
			class A extends LocalInnerClassExample {}
	}

}
