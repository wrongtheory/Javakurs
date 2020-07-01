package operators_type_ubungen;

public class C02 {
	Number n = Integer.valueOf(10);

	void m(Number n) {
		Integer i = (Integer) n;
		System.out.println(i);
	}

	public static void main(String[] args) {
		new C02().m(Integer.valueOf(3));
		new C02().m(Double.valueOf(3));
	}
}