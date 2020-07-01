package methods;

interface Pow{
	static void wow() {
		System.out.println("pow");
	}
}

interface Wow {
	default void wow() {
		System.out.println("wow");
	}
}

abstract class A{
	public abstract void a();
}


public class Powwow implements Wow, Pow{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Powwow f = new Powwow();
			f.wow();
	}

}
