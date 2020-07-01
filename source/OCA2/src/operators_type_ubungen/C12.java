package operators_type_ubungen;

public class C12 {
	void m(CharSequence cs) {
	}

	void m2() {
		m(Integer.toString(123));
		Object o = "gaga";
		m((String) o);
		m((CharSequence) o);
	}
}
