package genericsAndCollections2;


class goOut{
	public void doSomething() {
		System.out.println("It's a beautiful day, go out");
	}
	
}

class stayAtHome {
	public void stop() {
		System.out.println("It rains, stay at home");
	}
}


public class ObjectCompositionExample {

	private final goOut goOut;
	private final stayAtHome stayAtHome;
	
	
	public ObjectCompositionExample() {
		goOut = new goOut();
		stayAtHome = new stayAtHome();
	}
	
	public void goOut() {
		this.goOut.doSomething();
	}
	
	public void stayAtHome() {
		this.stayAtHome.stop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ObjectCompositionExample objectCompositionExample = new ObjectCompositionExample();
			objectCompositionExample.goOut();
			objectCompositionExample.stayAtHome();
	}

}
