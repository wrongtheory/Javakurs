package operators_type_ubungen;

class C181 {
	String s;
}

public class C18 {
	public static void main(String[] args) {
		C181 c181 = new C181();
		System.out.println(c181.s instanceof CharSequence);
		Object o = c181.s;
		CharSequence cs = (String) o;
		System.out.println(cs);
	}
}
