package concurency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckResults {
	
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		// TODO Auto-generated method stub
		
		ExecutorService service = null;
		
		try {
			
			service = Executors.newSingleThreadExecutor();
			
			Future<?> result = service.submit(() -> {
				for(int i=0; i<5000000000L; i++) CheckResults.counter++;
			});
			
			result.get(100000000L, TimeUnit.NANOSECONDS);
			System.out.println("Reached");
		} catch(TimeoutException e) {
			System.out.println("Not reached in time");
		} finally {
			if(service != null) service.shutdown();
			if(service != null) {
				service.awaitTermination(10, TimeUnit.SECONDS);
				if(service.isTerminated())
					System.out.println("all task terminated");
				else
					System.out.println("at least one thread is still running");
			}
		}

	}

}
