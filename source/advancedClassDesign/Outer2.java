package advancedClassDesign;

public class Outer2 {
	
	private int length = 5;
	
	public void calculate() {
		final int width = 20;
		
		class Inner { // Local inner class
			private final int i=1;
			public void multiply() {
				System.out.println(length * width);
			}
		}
		
		Inner inner = new Inner();
		inner.multiply();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 outer2 = new Outer2();
		outer2.calculate();
	}

}
