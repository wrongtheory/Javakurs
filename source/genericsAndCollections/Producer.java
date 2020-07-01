package genericsAndCollections;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	protected BlockingQueue queue = null;
	
	public Producer(BlockingQueue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Producer put: 1");
			queue.put("1");
			Thread.sleep(2000);
			System.out.println("Producer put: 2");
			queue.put("2");
			Thread.sleep(1000);
			System.out.println("Producer put: 3");
			queue.put("3");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
