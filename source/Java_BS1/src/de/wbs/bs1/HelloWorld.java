package de.wbs.bs1;
import java.nio.Buffer;
import java.util.Date;
import java.sql.*;


public class HelloWorld {

	static Date date;
	
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	static int[] temps = new int[6];

	public static final void main(String...$n) {
		 
		System.out.println(temps[1]);
		System.out.println(temps);
		
		System.out.println(add(2,5));
		
		int a = 1;
		int b = 2;
		
			System.out.println();
		
		if(a++ <0 & b++ > 1)
			System.out.println("a = " + a + " b = " + b);

		int x = 0b101;
		short y = 0XBBB;
		System.out.println(x);
		System.out.println(y);
		
		
		Integer i[] = new Integer[]{1,2};
		
		for (int j : i) {
			System.out.println(j);
		}
		
		for(int u=0; u<10; u++){
			System.out.println(u);
		}

		System.out.println(077);
		
		boolean aa;
		byte hh;
		char bb;
		short cc;
		int dd = 1;
		long ee;
		double ff;
		float gg;
		
		for(int k=1;k<=20;k++) {
			System.out.println(k + " * " + k + " = " + (k*k));
		}
		
		int q = 0;
		
		while(q++ < 20) {
			String message = q > 10 ? "Grather than" : false; 
		}
		
		
		
		
	}
}
