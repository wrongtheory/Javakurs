package tag16;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println(div(0, 2));
	}

	
	public static int div(int a, int b) {
		assert b!=0 : "der Inhalt von b ist 0!";
		return a/b;
	}
	
}
