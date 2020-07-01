package tag3;

public class CA77 {
	public static void main(String[] args) {
		int n1 = 5;
		final int n2 = 6;
		switch (n1) {
		case 1:
			System.out.println("a");
		case 2:
			System.out.println("b");
			break;
		case n2:
			break;
		}
	}
}