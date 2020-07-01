package tag3;

public class CA88 {
	public static void main(String[] args) {
		String s = Integer.toHexString(15);
		switch (s) {
		case "f":
			System.out.println("f");
		case "0xF":
			System.out.println("0xF");
		case "0xf":
			System.out.println("0xf");
			break;
		}
		System.out.println(s);
	}
}