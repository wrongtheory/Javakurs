package genericsAndCollections2;

interface Walk {
	boolean isQuadruped();
	abstract double getMaxSpeed();
}

interface Walk2 {
	default void test() {System.out.println("Walk2->test");}
	static void test2() {System.out.println("Walk2-test2");}
	public void test3();
}

interface Walk3 {
	default void test() {System.out.println("Walk2->test");}
	static void test2() {System.out.println("Walk2-test2");}
	public void test3();
}

interface Run extends Walk {
	public abstract boolean canHuntWhileRunning();
	abstract double getMaxSpeed();
}

class Lion implements Run {
	public boolean isQuadruped() {
		return true;
	}
	
	public boolean canHuntWhileRunning() {
		return true;
	}
	
	public double getMaxSpeed() {
		return 100;
	}

}

public class SecondInterface implements Walk2, Walk3{
	public void test() {}
	public void test2() {}
	public void test3() {}
	
	
}
