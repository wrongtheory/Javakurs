package tag3;

public class C5 {
	int m() {
		try {
			int n = "abc".charAt('d');
			return 12345;
		} catch (IndexOutOfBoundsException e) {
		}
	}
}