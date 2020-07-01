package wbs.util;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Stack;
import java.util.Vector;

public class NewDemo {
	public static void main(String[] args) {
 //AbstractList<Integer> al = new AbstractList<>(); // compilerfehler // cannot instantiate the abstract class AbstractList,
// Collection c = new Collection(); // compilerfehler // Collection is a Interface
// Math math = new Math(); // compilerfehler // Math has private constructor
// Integer n = new Integer(); // compilerfehler // Integer has no Constructor
 //Stack stack = (Stack) new Vector(); // compilerfehler
 Vector v = new Stack();
		Integer n = new Integer(3); // ok
		AbstractCollection vector = new Stack<Integer>(); // ok
		vector.add(n);
	}
}