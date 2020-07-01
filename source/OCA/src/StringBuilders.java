
public class StringBuilders {

	public static void main(String[] args) {
		
		
		StringBuilder[] sb1 = new StringBuilder[100];
		sb1[0] = new StringBuilder().append(true);
		System.out.println(sb1[0].capacity());
		StringBuilder sb2 = new StringBuilder("animal");
		StringBuilder sb3 = new StringBuilder(10);
		
		System.out.println(sb1[0].capacity()); // 16
		System.out.println(sb2.capacity()); // 22
		System.out.println(sb3.capacity()); // 10
		sb3.append("1234567899");
		System.out.println(sb3.capacity()); // 10
		sb3.append("0");
		System.out.println(sb3.capacity()); // 22
		sb3.append("123456789987");
		System.out.println(sb3.capacity()); // 46
		
		StringBuilder sb4 = new StringBuilder("animals");
		System.out.println(sb4.substring(sb4.indexOf("a"), sb4.indexOf("al")));
		//sb4.insert(0,"-");
		//sb4.insert(7, "-");
		System.out.println(sb4);
		sb4.deleteCharAt(sb4.length()-1);
		System.out.println(sb4);
		sb4.delete(0, 3);
		System.out.println(sb4);
		
		StringBuilders s5 = new StringBuilders();
		
		StringBuilders s6 = new StringBuilders();
		StringBuilders s7 = s5;
		
		
		System.out.println(s5==s6);
		System.out.println(s5==s7);
		System.out.println(s5.equals(s6));
		System.out.println(s5.equals(s7));
		
		

	}

}
