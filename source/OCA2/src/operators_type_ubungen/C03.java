package operators_type_ubungen;

import java.io.Serializable;

public class C03 {
	public static void main(String[] args) {
		CharSequence cs = Math.random() > 0.5 ? "nice" : new StringBuffer("nice, too!");
		System.out.println(cs instanceof Serializable);
		//System.out.println(cs);
	}
}