package concurency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleTaskExample {
	static int i=0;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		ScheduledExecutorService service2 = Executors.newScheduledThreadPool(10);
		
		Runnable task1 = () -> System.out.println("Hello Zoo");
		Callable<String> task2 = () -> "Monkey";
		
		Runnable task3 = () ->{
			System.out.println(i);
			System.out.println("\n\n\n\n\n\n\n\n\n\n");
			i++;
		};
		
		//Future<?> result1 = service.schedule(task1, 5, TimeUnit.SECONDS);
		//Future<?> result2 = service.schedule(task2, 8, TimeUnit.MINUTES);
		//Future<?> result3 = service.scheduleAtFixedRate(task1, 5, 3, TimeUnit.SECONDS);
		Future<?> result4 = service2.scheduleAtFixedRate(task3, 0, 1, TimeUnit.SECONDS);
		//System.out.println(result4.get());
		//service.shutdown();
		//if(service.isTerminated())
			//System.out.println("Finish");
		//else
		//	System.out.println("At least one thread is still running");
		//service.shutdown();

	}

}
