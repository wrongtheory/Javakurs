package passjava;

public class Foo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		short c = 30+1;
		System.out.println(c);
		double d = 10_000_000;
		
		char a = 1;
		long b = a;
		
		byte e = 1;
		short f = e;
		
		a = (char)f;
	}

}
