package enthuware;

import java.util.Arrays;

public class Test2 {
	
	static String[] sa = {"a","aa","aaa","aaaa"};
	static {
		Arrays.sort(sa);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String search = "";
		if(args.length != 0) search = args[0];
		System.out.println(search);
		//System.out.println(args[0]);
		for(String s: sa)
		System.out.println(s);
		System.out.println(Arrays.binarySearch(sa, search));
		
	}

}
