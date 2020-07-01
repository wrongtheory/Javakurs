package genericsAndCollections;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	protected BlockingQueue queue = null;
	
	public Consumer(BlockingQueue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		
		try {
			System.out.println("Consumer take " + queue.take());
			System.out.println("Consumer take " + queue.take());
			System.out.println("Consumer take " + queue.take());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
