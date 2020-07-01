package operators_type_ubungen;

public class C11 {
	void m(CharSequence cs) {
	}

	void m2() {
		m("abc");
		m(new StringBuffer("abc"));
		m(new StringBuilder("abc"));
	}
}