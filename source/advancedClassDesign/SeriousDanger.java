package advancedClassDesign;

class Problem extends Exception{}

abstract class Danger {
	protected abstract void isDanger() throws Problem;
}


public class SeriousDanger extends Danger{
	
	protected void isDanger() throws Problem {
		throw new RuntimeException();
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		new SeriousDanger().isDanger();
	}

}
