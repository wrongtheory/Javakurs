package concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Food {}
class Water {}

public class Fox {

	public void eatAndDrink(Food food, Water water) throws InterruptedException {
		synchronized (food) {
			System.out.println("Got Food!");
			move();
			synchronized (water) {
				System.out.println("Got Water!");
				this.wait();
			}
		}
	}
	
	public void drinAndEat(Food food, Water water) {
		synchronized (water) {
			System.out.println("Got Water!");
			move();
			synchronized (food) {
				System.out.println("Got Food!");
			}
		}
	}
	
	public void move() {
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fox foxy = new Fox();
		Fox tails = new Fox();
	
		Food food = new Food();
		Water water = new Water();
		
		ExecutorService service = null;
		
		try {
			service = Executors.newScheduledThreadPool(10);
			service.submit(() -> {
				try {
					foxy.eatAndDrink(food, water);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			service.submit(() -> tails.drinAndEat(food, water));
		} finally {
			if(service != null) service.shutdown();
		}
		
	}

}
