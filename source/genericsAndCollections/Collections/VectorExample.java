package genericsAndCollections.Collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v = new Vector<>(2);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		System.out.println(v.elements().nextElement().compareTo(1));
		v.ensureCapacity(25);
		
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
