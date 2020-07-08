package genericsAndCollections.Collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(123112);
		ll.add(2);
		ll.add(12315);
		ll.add(4);
		ll.add(54545);
		
		System.out.println(ll.offer(12));
		System.out.println(ll.offerFirst(25));
		System.out.println(ll.getLast());
		
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.peek());
		System.out.println(ll.pop());
		
		

	}

}
