package concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
	
	private int sheepCount = 0;
	//private AtomicInteger sheepCount = new AtomicInteger(0);
	
	private final Object lock = new Object();
	
	private synchronized void incrementAndReport() {
		//synchronized (this) {
			//synchronized (lock) {
		System.out.println((++sheepCount) + " ");
		//}
	}
	
	//private void incrementAndReport() {
		//System.out.println(sheepCount.incrementAndGet());
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService service = null;
		
		try {
			service = Executors.newFixedThreadPool(20);
			SheepManager manager = new SheepManager();
			
			for(int i=0; i<10; i++)
				service.submit(() -> manager.incrementAndReport());
		} finally {
			if(service != null) service.shutdown();
		}
	}

}
