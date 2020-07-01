package tag3;

public class CA99 {
	public static void main(String[] args) {
		String s = "mantel";
		int len = s.length();
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while (i < len) {
			switch (s.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				sb.append('a');
				break;
			case 'm':
			case 'n':
			case 't':
				sb.append('l');
			}
			i++;
		}
		System.out.println(sb);
	}
}