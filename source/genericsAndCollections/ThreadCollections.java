package genericsAndCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;





public class ThreadCollections {
	
	static CountDownLatch latch = new CountDownLatch(1);

	private static List<Integer> fillList(List<Integer> list, int i){
		for(int j = 1; j<=i; j++)
			list.add(j);
			return list;
	}
	
	

	
	private static void checkList(List<Integer> list) throws InterruptedException, ExecutionException {
		
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
	
		
		Future<Long> f1 = ex.submit(new ListRunner(0,50,list,latch));
		
		Future<Long> f2 = ex.submit(new ListRunner(50,100,list,latch));
		
		latch.countDown();
		
		System.out.println("Thread 1: " + f1.get()/1000);
		System.out.println("Thread 2: " + f2.get()/1000);
		
		
	}
	
	
	static class ListRunner implements Callable<Long> {

		int i = 0, j = 0;
		List<Integer> l = new ArrayList<Integer>();
		
		public ListRunner(int i, int j, List<Integer> list, CountDownLatch latch) {
			this.i = i;
			this.j = j;
			this.l = list;
		}

		public Long call() throws Exception {
			latch.await();
			
			long startTime = System.nanoTime();
			for(int x= i; x< j; x++) {
				l.get(i);
			}
			
			return System.nanoTime() - startTime;
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		
		List<Integer> list1 = Collections.synchronizedList(new ArrayList<Integer>());
		List<Integer> list2 = new CopyOnWriteArrayList<Integer>();
		
		fillList(list1, 100);
		fillList(list2, 100);
		
		
		System.out.println("List synchtonized");
		checkList(list1);
		
		System.out.println("CopyOnWriteArrayList");
		checkList(list2);
		

	}

}
