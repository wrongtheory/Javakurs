package concurency;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class WeightAnimalAction extends RecursiveAction{

	private int start;
	private int end;
	private Double[] weights;
	
	public WeightAnimalAction(Double[] weights, int start, int end) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}
	
	protected void compute() {
		if(end-start <= 3) 
		for(int i=start; i<end;i++)
		{
			weights[i] = (double)new Random().nextInt(100);
			System.out.println("Animal Weighed: " + i);
		}
		else {
			int middle = start+((end-start)/2);
			System.out.println("[start= " + start + " , middle = " + middle + " ,end = " + end + "]");
			invokeAll(new WeightAnimalAction(weights, start, middle), new WeightAnimalAction(weights, middle, end));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double[] weights = new Double[10];
		
		ForkJoinTask<?> task = new WeightAnimalAction(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
		
		System.out.println();
		System.out.println("Weights: ");
		
		Arrays.asList(weights).stream().forEach(d -> System.out.print(d.intValue() + " "));

	}

}
