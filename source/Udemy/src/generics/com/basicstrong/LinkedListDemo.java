package generics.com.basicstrong;

import java.util.ArrayList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DataNode<Integer> node2 = new DataNode<>(20, null);
		DataNode<Integer> node1 = new DataNode<>(35, node2);
		
		DataNode<Double> node22 = new DataNode<>(20.9, null);
		DataNode<Double> node11 = new DataNode<>(35.8, node22);
		
		DataNode<Number> node111 = new DataNode<>(Double.valueOf(33.3), null);
		node111.setNext(node2);
		
		
		System.out.println(node1.toString());
		System.out.println(node11.toString());
	}

}
