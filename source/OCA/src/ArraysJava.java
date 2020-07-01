import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class ArraysJava {
	
	
	public final int i;
	public static final int j;
	
	
	static {j=2;}
	{i=1;}
	
	
	/*public ArraysJava() {
	
		
	}*/

	static int[] numbers = new int[5];
	
	static int a;
	
	static char c;
	
	static String t;
	
	static String[] d = new String[4];
	
	static StringTokenizer token = new StringTokenizer("a b c d");
	
	static String bugs[] = {"cricket","beetle","lady"}; 
	
	static ArrayList l = new ArrayList<>();
	static List l2 = new ArrayList<>();
	
	public void test() {
		
	}
	
	public static int moreA(int a, int...nums) {
		
		
		return nums.length;
		}
	public void moreB(String...nums) {}
	
	public static void main(String[] args) {
		
		int a = moreA(1, new int[2]);
		System.out.println("varargs " + a);
		
		int b;
		String s = new String();
		
		/*
		 * for(int i: numbers) System.out.println(i);
		 * 
		 * int num[] = new int[5];
		 * 
		 * for(int j: num) System.out.println(j);
		 */
		
		System.out.println(a);
		//System.out.println(b);
		System.out.println(s);
		System.out.println(t);
		//System.out.println(c);
		
		for(String e: d)
			System.out.println(e);
		
		for(int i = 0; token.hasMoreElements();i++)
			d[i] = token.nextToken();
		
		for(String st:d)
			System.out.println(st);
		
		System.out.println(java.util.Arrays.toString(bugs));
		
		
	}

}
