
class Animal2{
	private int age = 1;
	String name = "Animal2";

	public Animal2(int age, String name){
		super();
		//this(4);
		this.age = age;
		this.name = name;
	}
	
	public Animal2(int age) {
		super();
		this.age = age;
		this.name = name;
	}

}

class Gorilla extends Animal2{
	
		//int age = 2;
		String name = "Gorilla";
		
		public Gorilla(int age) {
		super(age, "Gorilla");
	}
	
	public Gorilla() {
		super(5);
		System.out.println(name);
	}
}


class Bird{
	public void fly() {
		System.out.println("bird is flying");
	}
	public Number eat(int food) {
		System.out.println("bird is eating " + food+ "units of food");
		return 1;
	}
}

class Eagle extends Bird{
	public int fly(int height) {
		System.out.println("bird is flying at " + height + "meters");
		return height;
	}
	public Integer eat(int food) {
		System.out.println("bird is eating " + food+ "units of food");
		return 1;
	}
}

class Bear{
	public static void sneeze() {
		System.out.println("Bear si sneezing");
	}
	public static void  hibernate() {
		System.out.println("Bear is hibernating");
	}
	
	public void bear() {
		System.out.println("Bear");
	}
}

class Panda extends Bear{
	public static void sneeze() {
		System.out.println("Panda bear sneezes quietly");
	}
	public static void hibernate() {
		System.out.println("Panda bear is going to sleep");
	}
	public void bear() {
		System.out.println("Panda");
		//super.bear();
	}
}


class Marsupial {
	public boolean isBiped() {
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs :" + isBiped());
	}
	
}


class Kangaroo extends Marsupial {
	public boolean isBiped() {
		return true;
	}
	

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
	
}



public class Super {

	public static void main(String[] args) {
		
		
		Kangaroo k = new Kangaroo();
		k.getMarsupialDescription();
		k.getKangarooDescription();

		
		
		//Gorilla g = new Gorilla();
		//System.out.println();
		
		Panda p = new Panda();
		//p.sneeze();
		//p.sneeze();
		//p.bear();
		
		
		
		//p.hibernate();
		
		Bear b = new Bear();
		//b.sneeze();
		//b.hibernate();
		//b.bear();
		
	}

}
