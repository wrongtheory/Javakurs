
// public final abstract class HZ{} a class cannot be final and abstract at the same time 


abstract class Animal4{
	public abstract String getName();
}

abstract class BigCat extends Animal4 {
	public String getName() {
		System.out.println("BigCat");
		return "BigCat";
	}
	public abstract void roar();
}

class Lion extends BigCat {
	public void roar() {
		System.out.println("Lion");
	}

	public String getName() {
		System.out.println("Lion getName");
		return "BigCat";
	}

	public Lion() {
		super.getName();
	}
	
}


abstract class Whale{
	protected abstract void sing();
}

class Hump extends Whale {
	// void sing() {} //cannot reduce the visibility
	//private void sing() {} //cannot reduce the visibility\
	protected void sing() {}
	public void sing(int i) {}
}


abstract class Animal3 {
	
	protected int age;
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public abstract String getName();
	
	
}

class Swan extends Animal3{
	
	public String getName() {
		return "Swan";
	}
}


public class Abstract {

	public static void main(String[] args) {
		
		Lion lion = new Lion();
		lion.roar();
		lion.getName();
	}

}
