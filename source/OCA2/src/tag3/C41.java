package tag3;

enum E4 {
	A, B, C;
}

public class C41 {
	public static void main(String[] args) {
		E4 e41 = E4.A;
		switch (e41) {
		case A:
			System.out.println("a");
		case B:
			break;
		}
	}
}