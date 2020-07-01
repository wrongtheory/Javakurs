
public class MethodsAndEncapsulation {

	long[] l = new long[4];
	
	private static final int one;
	private final int two;
	private final int three;
	
	static {
		one = 1;
		//one = 2;
	}
	
	{
		three = 2;
	}
	
	public MethodsAndEncapsulation() {
		two = 2;
	}
	
	public static void newNumber(int num) {
		num = 8;

	}
	
	public static void speak(StringBuilder s) {
	
		s.append("Webby");	
	
	}
	
//	public void walk(int... start, int...is nums) {} // does not compile
	
	public static void main(String[] args) {
			
		//MethodsAndEncapsulation.main(new String[0]);
		
		StringBuilder sb = new StringBuilder();
		speak(sb);
		int num = 4;
		newNumber(num);
		
		System.out.println(num);
		System.out.println(sb);
		
		fly((short)2);
		move(3);
		
		play((long)4);
		play((long)1,(long)2,(long)3);
		play(5L);

	}
	
	//public void fly(int i) {}
	//public int fly(int i) {return i;}
	
	public static void fly(int i) {
		System.out.println("int");
	}
	
	public static void fly(short i) {
		System.out.println("short");
	}
	
	public static void move(int i) {
		System.out.println("int miles");
	}
	
	public static void move(Integer i) {
		System.out.println("Integer");
	}
	
	public static void play(Long l) {System.out.println("long");}
	
	public static void play(Long... l) {System.out.println("long varargs");}
	
	
	
	
	

}
