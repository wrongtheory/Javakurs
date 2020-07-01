package operators_type_ubungen;

import java.io.Serializable;

public class C04 {
	public static void main(String[] args) {
		CharSequence cs = Math.random() > 1.0 ? "nice" : new C041();
		System.out.println(cs instanceof Serializable);
		System.out.println(cs);
	}
}