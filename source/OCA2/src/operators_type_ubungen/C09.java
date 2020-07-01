package operators_type_ubungen;

class C091 {
	private int n = 1;
}

class C092 extends C091 {
	int n = 2;
}

public class C09 {
	public static void main(String[] args) {
		C091 c091 = new C092();
		System.out.println(((C092) c091).n);
		System.out.println(c091.n);
	}
}
