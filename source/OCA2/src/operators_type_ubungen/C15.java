package operators_type_ubungen;

class C151 {
	static void m() {
		System.out.println("a");
	}
}

class C152 extends C151 {
	static void m() {
		System.out.println("b");
	}
}

public class C15 {
	@SuppressWarnings("static-access")
	public static void main(String... av) {
		C151 c151 = new C152();
		c151.m();
		((C152) c151).m();
	}
}
