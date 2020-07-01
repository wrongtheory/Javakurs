package genericsAndCollections;

import java.util.ArrayList;
import java.util.Collection;

public class Test<T> {
	  T a,b;
	
	public Test(T a, T b) {
		this.a = a;
		this.b = b;
		
		//T c = a+b;
	}
	
	public void op() {
		
		
		
	}
	
	//public static ArrayList<String> al = new ArrayList();
	public static ArrayList<Number> al2 = new ArrayList();
	public static ArrayList<Double> al3 = new ArrayList();
	
	public static void m1(ArrayList<? super Integer> l) {
		//l.add(10.5);
		//l.add("A");
		l.add(10);
		//l.add(null);
		//l.add("1");
		System.out.println(l);
	}
	
	
	public <T> void m2(T obj) {
		
	}
	
	
	public static void main(String[] args) {
	//m1(al);
		m1(al2);
		//m1(al3);
		
		ArrayList l = new ArrayList<String>();
		l.add(10);
		l.add(10.5);
		l.add(true);
		l.add("S");
		
		System.out.println(l);
		
	}
	


}
