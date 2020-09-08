package enthuware;

class Point {
	int x, y;
}

class ColoredPoint extends Point {
	int color;
}


public class Test1 {

	
	static void test(ColoredPoint p, Point q) {
		System.out.println("ColoredPoint, Point");
	}
	
	static void test(Point p, ColoredPoint q) {
		System.out.println("Point, ColoredPoint");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColoredPoint cp = new ColoredPoint();
		test(cp, cp);
		
	}

}
