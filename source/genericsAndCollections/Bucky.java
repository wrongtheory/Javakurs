package genericsAndCollections;

public class Bucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] iray = {1,2,3,4};
		Character[] cray = {'b','u','c','k','y'};
		
		printMe(iray);
		printMe(cray);
		
		System.out.println(max(23, 42, 1));
		System.out.println(max("apples", "tots", "chicken"));

	}
	
	public static <T> void printMe(T[] x) {
		for(T t: x)
			System.out.print(t);
		System.out.println();
	}
	
	
	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T m = a;
		
		if(b.compareTo(a) > 0) 
			m = b;
		
		if(c.compareTo(m) > 0)
			m = c;
		
		return m;
	}
}
