package Ubungen20_05;

class C141 {
	int n = 3;
	static int m = 4;

	void m1() {
		System.out.println("a");
	}

	static void m2() {
		System.out.println("aa");
	}
}

class C142 extends C141 {
	int n = 30;
	static int m = 40;

	void m1() {
		System.out.println("b");
	}

	static void m2() {
		System.out.println("bb");
	}
}

public class C14 {
	public static void main(String[] args) {
		C141 c141 = new C142();
		System.out.println(c141.m);
		c141.m1();
		c141.m2();
		System.out.println(((C142) c141).m);
		((C142) c141).m1();
		((C142) c141).m2();
	}
}