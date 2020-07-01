package tag3;

class E1 extends Exception {
}

class E2 extends Exception {
}

public class C13 {
	
	public static void main(String[] args) throws E1, E2 {
		m();
	}
	
	public static void m() throws E1, E2 {
		try {
			if (Math.random() > 0.5) {
				throw new E1();
			} else {
				throw new E2();
			}
		} catch (Exception e) {
			throw e;
		}
	}
}

