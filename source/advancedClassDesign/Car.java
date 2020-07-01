package advancedClassDesign;


interface Drive {
	int SPEED = 5;
	default int getSpeed() {return SPEED;}
}

interface Hover {
	int MAX_SPEED = 5;
	default int getSpeed() {return MAX_SPEED;}
}

public class Car implements Drive, Hover{
	
	@Override
	public int getSpeed() {return 1;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class RaceCar extends Car {
			@Override
			public int getSpeed() {return 10;}
		};
		System.out.println(new RaceCar().getSpeed());
		
	}

}
