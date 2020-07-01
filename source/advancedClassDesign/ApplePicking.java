package advancedClassDesign;

interface Edible{
	void eat();
}

public class ApplePicking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edible edible = new Edible() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("You");
			}
		};
	}

}
