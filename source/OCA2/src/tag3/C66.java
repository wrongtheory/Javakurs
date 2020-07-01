package tag3;

enum E61 {
	A, B, C;
}

public class C66 {
	public static void main(String[] args) {
		E61 e61 = E61.C;
		int n = 1;
		switch (e61) {
		default:
			n++;
		case A:
			n++;
		case B:
			n++;
		}
		System.out.println(n);
	}
}