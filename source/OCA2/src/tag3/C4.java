package tag3;

public class C4 {
	void m() {
		try {
			int i = Integer.parseInt("blabla");
		} catch (IllegalArgumentException | IndexOutOfBoundsException e) {
			e = new RuntimeException();
		}
	}
}
