package advancedClassDesign;

public class Outer {
	
	private String greeting = "Hi";
	
	protected class Inner { // member inner class (protected)
		public int repeat = 3;
		
		public void go() {
			for(int i=0; i< repeat; i++)
				System.out.println(greeting);
		}
	}
	
	private class AnotherInner{ // member inner class (private)
		
		//static int i; // no static
		
		private int sumTwoNumbers(int a, int b) {
			return a+b;
		}
	}
	
	class DivideClass extends AnotherInner{ // member inner class (default)
		private double sumTwoNumbers(double a, double b) {
			return a/b;
		}
	}
	
	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.callInner();
		int sum = outer.new AnotherInner().sumTwoNumbers(3, 4);
		System.out.println("Sum is " + sum);
		double div = outer.new DivideClass().sumTwoNumbers(14, 7);
		System.out.println("Diff is " + div);
		
	}

}
