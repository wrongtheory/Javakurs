class Animal5 {
	
	static int i;
	void jump() {
		System.out.println("Animal");
	}
}

class Cat5 extends Animal5{
	
	void jump(int a) {
		System.out.println("Caty");
	}
}

class Rabbit5 extends Animal5{
	void jump() {
		System.out.println("Rabbit");
	}
}



public class Circus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Animal5 cat = new Cat5();
		Rabbit5 rabbit = new Rabbit5();
		cat.jump();
		rabbit.jump();
		
		//int[] arr = new int[1] {1};
		String s = "abc";
		//String goto;
		
		Boolean bool = false;
		

	}

}
