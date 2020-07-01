package tag3;

enum E51 {
	A, B, C;
}

public class C55 {
	public static void main(String[] args) {
		E51 e51 = E51.A;
		switch (e51) {
		case A:
			System.out.println("a");
		case B:
			break;
		case C:
			/*
			 * break; case A: System.out.println("b");
			 */
		}
	}
}