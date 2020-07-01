package Ubungen20_05;

 class C201 {
	protected static StringBuffer sb = new StringBuffer();
	protected int n;
	static {
		sb.append("aha");
	}
	{
		n++;
	}
	{
		n++;
	}
}

public class C20 extends C201 {
	static {
		sb.append("nana");
	}
	{
		n++;
	}

	public static void main(String[] args) {
		new C201();
		new C201();
		System.out.println(sb);
		System.out.println(new C201().n);
	}
}