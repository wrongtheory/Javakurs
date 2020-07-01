package operators_type_ubungen;

import java.io.Serializable;

public class C13 {
	int m(CharSequence cs) {
		return cs.length();
	}

	boolean m2(Serializable s) {
		return s instanceof CharSequence;
	}
}