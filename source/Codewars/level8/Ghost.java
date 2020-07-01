package Codewars.level8;

import java.util.Random;

public class Ghost {
	
	static String[] colors = {"white","yellow","purple","red"};
	
	static Random r = new Random();
	
	static public String getColor() {
		return colors[r.nextInt(colors.length)];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(getColor());
	}

}
