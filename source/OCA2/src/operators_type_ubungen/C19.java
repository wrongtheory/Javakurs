package operators_type_ubungen;

public class C19 {
	static void m(Number n) {
		Integer i = (Integer) n;
		System.out.println(i.compareTo(Integer.valueOf("123")));
	}

	public static void main(String[] args) {
		m(Integer.valueOf("123"));
		m(Double.valueOf("123"));
	}
}