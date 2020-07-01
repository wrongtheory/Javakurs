package exceptions;

import java.io.IOException;

public class ExceoptionA {
	
	static int[] a = {1,2,3};
	static String[] s = new String[4];
	static int[][] game = new int[6][6];

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//System.out.println(0/0);
		
		game[3][3] = 6;
		Object[] obj = game;
		obj[3] = "X";
		System.out.println(game[3][3]);
		
		s[s.length] = "a";
		
		try {
		for(int i=0;i<=a.length;i++)
			System.out.println(a[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception");
		}
		
		System.out.println("nach exception");
	}

}
