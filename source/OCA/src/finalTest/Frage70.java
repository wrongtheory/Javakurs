package finalTest;

public class Frage70 {
	
	public int adjust(int l, String[] t) {
		l++;
		t[0] = "LONG";
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Frage70 f = new Frage70();
		int l = 5;
		String[] t = new String[1];
		l = f.adjust(l, t);
		System.out.println(l + " " + t[0]);
	}

}
