package genericsAndCollections;

import java.util.ArrayDeque;

public class Test3Frage4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<String> greetings = new ArrayDeque<String>();
		
		greetings.push("hello");
		greetings.push("hi");
		greetings.push("ola");
		
		System.out.println(greetings);
		
		greetings.pop();
		
		System.out.println(greetings);
		
		greetings.peek();
		
		System.out.println(greetings);
		
		while(greetings.peek() != null)
			System.out.println(greetings.pop());
		
		System.out.println(greetings);

	}

}
