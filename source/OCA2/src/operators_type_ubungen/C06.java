package operators_type_ubungen;

import java.io.Serializable;

public class C06 {
	public static void main(String[] args) {
		String s1 = "seltsam im nebel zu wandern";
		String s2 = (String) (Serializable) (CharSequence) (Object) s1;
		System.out.println(s1 == s2);
	}
}