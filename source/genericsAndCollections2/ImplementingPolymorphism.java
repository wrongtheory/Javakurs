package genericsAndCollections2;

interface LivesInOcean {
	public void makeSound();
}

class Dolphin implements LivesInOcean {
	public void makeSound() {
		System.out.println("whistle");
	}
}

class Whale implements LivesInOcean {
	public void makeSound() {
		System.out.println("sing");
	}
}


public class ImplementingPolymorphism {

	public void checkSound(LivesInOcean animal) {
		animal.makeSound();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ImplementingPolymorphism impl = new ImplementingPolymorphism();
			impl.checkSound(new Dolphin());
			impl.checkSound(new Whale());
	}

}
