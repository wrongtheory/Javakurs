package Ubungen20_05;

class C111 {
	CharSequence m1() {
		return "nana";
	}

	static void m12() {
		System.out.println("m12 of C111");
	}
}

public class C11 extends C111 {
	@Override
	String m1() {
		return "lalla";
	}

	static void m12() {
		System.out.println("m12 of C11");
	}

	public static void main(String... args) {
		C111 c111 = new C11();
		System.out.println(c111.m1());
		c111.m12();
		((C11) c111).m12();
		System.out.println(((C11) c111).m1());
	}
}
