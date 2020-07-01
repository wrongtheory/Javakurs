package operators_type_ubungen;

interface I10 {
	void m();
}

class C101 {
	void m(I10 i10) {
	}
}

public class C10 implements I10 {
	public static void main(String... blabla) {
		new C10().m();
	}

	public void m() {
		new C101().m(new C10());
	}
}