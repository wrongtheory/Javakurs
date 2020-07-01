package tag3;

public class C6 {
	@SuppressWarnings("finally")
	int m() {
		try {
			int n = "abc".charAt('0' - 0);
			return n;
		} catch (IndexOutOfBoundsException e) {
		} finally {
			return 54321;
		}
	}

	public static void main(String[] args) {
		System.out.println(new C6().m());
	}
}