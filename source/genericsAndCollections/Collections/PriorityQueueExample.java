package genericsAndCollections.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new PriorityQueue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q);

	}

}
