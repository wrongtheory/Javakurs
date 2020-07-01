package operators_type_ubungen;

class C141 {
	int n = 141;
}

class C142 extends C141 {
	int n = 142;
}

public class C14 {
	public static void main(String blabla[]) {
		C141 c141 = new C141();
		System.out.println(c141.n);
		c141 = new C142();
		System.out.println(c141.n);
		System.out.println(((C142) c141).n);
	}
}