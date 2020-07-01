package advancedClassDesign;

abstract interface CanSwim {
	public void swim();
}

public class Turtle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance = 7;
		
		CanSwim seaTurtle = new CanSwim() {
			
			@Override
			public void swim() {
				// TODO Auto-generated method stub
				System.out.println(distance);
			}
		};
		
		seaTurtle.swim();
	}

}
