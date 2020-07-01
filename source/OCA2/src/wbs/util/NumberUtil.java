package wbs.util;

import java.util.ArrayList;
import java.util.List;

public class NumberUtil {

	public static void main(String[] args) {
		
		for(int i = 1; i<=50; i++)
			System.out.println(collatz(i));

	}
	
	public static List<Long> collatz(long n) {

		List<Long> list = new ArrayList<Long>();
		list.add(n);

			do {
				if (n % 2 == 0) {
					list.add(n /= 2);
				} else
					list.add(n = n* 3 + 1);

			} while (n != 1);

			return list;

	}
}