package Codewars.level8;

public class Twist {
	
	static String[] kata() {
		String[] websites = new String[1000];
		for(int i=0;i<1000;i++)
			websites[i] = "codewars";
		return websites;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = kata().length;
		System.out.println(a);
		
	}

}
