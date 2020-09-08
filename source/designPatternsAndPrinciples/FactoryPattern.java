package designPatternsAndPrinciples;

abstract class Food2{
	
	private int quantity;
	
	public Food2(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public abstract void consumed();
}


class Hay2 extends Food2 {
	public Hay2(int quantity) {
		super(quantity);
	}
	
	public void consumed() {
		System.out.println("Hay eaten: " + getQuantity());
	}
}


class Fish2 extends Food2 {
	public Fish2(int quantity) {
		super(quantity);
	}
	
	public void consumed() {
		System.out.println("Fish eaten: " + getQuantity());
	}
}

class Pallets2 extends Food2{
	public Pallets2(int quantity) {
		super(quantity);
	}
	
	public void consumed() {
		System.out.println("Factory Pattern eaten" + getQuantity());
	}
}


class FoodFactory2{
	public static Food2 getFood(String animalName) throws Exception {
		switch(animalName) {
		case "zebra": return new Hay2(100);
		case "rabbit": return new Pallets2(5);
		case "goat": return new Pallets2(30);
		case "polar bear": return new Fish2(10);
		}
		
		//throw new UnsupportedOperationException("Unsupported animal: " + animalName);
		throw new Exception();
	}
}

public class FactoryPattern{

	public static void main(String[] args) throws Exception {
		final Food2 food = FoodFactory2.getFood("polar bear");
		food.consumed();

	}

}
