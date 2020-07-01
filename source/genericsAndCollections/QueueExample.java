package genericsAndCollections;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(5);
		q.add(4);
		q.add(3);
		q.add(2);
		q.add(1);
		
		while(!q.isEmpty()) {
			//System.out.print(q.poll());
			q.poll();
		}
		
Queue<Integer> q2 = new PriorityQueue<Integer>(
		new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return ((o1%2==0 && o2%2==0) || (o1%2!=0 && o2%2!=0)) ? o1.compareTo(o2) : (o1%2==0 && o2%2 != 0) ? -1 : 1;
				
			
			}
		}
		);	

		q2.add(5);		
		//q2.add(3);
		q2.add(2);
		q2.add(1);
		q2.add(4);
		q2.add(3);
		q2.add(6);
		q2.add(9);
		q2.add(8);
		
		
		
		while(!q2.isEmpty()) {
			System.out.println(q2.poll());
			//q2.poll();
		}
		
		for(int i: q2)
			System.out.println(i);
		
		
	}

}
