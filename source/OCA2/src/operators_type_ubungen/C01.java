package operators_type_ubungen;

public class C01 {
	String s;

	@Override
	public String toString() {
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		System.out.println(new C01().s);
		System.out.println(new C01());
	}
}