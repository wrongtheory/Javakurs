package genericsAndCollections.Collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		
		System.out.println(s.peek());
		System.out.println(s.push(25));
		System.out.println(s);
		
		System.out.println(s);
	}

}
