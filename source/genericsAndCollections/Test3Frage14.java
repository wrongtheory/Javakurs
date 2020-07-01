package genericsAndCollections;

import java.util.Comparator;
import java.util.TreeSet;

public class Test3Frage14 implements Comparable<Test3Frage14>, Comparator<Test3Frage14>{
	
	private int num;
	private String text;
	
	public Test3Frage14(int n, String t) {
		// TODO Auto-generated constructor stub
		this.num = n;
		this.text = t;
	}
	
	public String toString() {return "" + num;}
	
	public int compareTo(Test3Frage14 s) {
		return text.compareTo(s.text);
	}
	
	public int compare(Test3Frage14 s1, Test3Frage14 s2) {
		return s1.num - s2.num;
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Test3Frage14 s1 = new Test3Frage14(88, "a");
		Test3Frage14 s2 = new Test3Frage14(55, "b");
		
		TreeSet<Test3Frage14> t1 = new TreeSet<Test3Frage14>();
		t1.add(s1); 
		t1.add(s2);
		
		TreeSet<Test3Frage14> t2 = new TreeSet<Test3Frage14>(s1);
		t2.add(s1); 
		t2.add(s2);
		
		System.out.println(t1 + " " + t2);
		
	}

}
