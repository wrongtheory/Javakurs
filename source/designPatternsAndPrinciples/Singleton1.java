package designPatternsAndPrinciples;

public class Singleton1 {

	private int quantity = 0;
	private Singleton1() {}
	
	
	private static final Singleton1 instance = new Singleton1();
	
	public static Singleton1 getInstance() {
		return instance;
	}
	
	public synchronized void addHay(int amount) {
		quantity+=amount;
	}
	
	public synchronized boolean removeHay(int amount) {
		if(quantity < amount) return false;
		quantity-=amount;
		return true;
	}
	
	public synchronized int getHayQyantity() {
		return quantity;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
