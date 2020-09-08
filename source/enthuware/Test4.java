package enthuware;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NavigableSet<String> myset = new TreeSet<>();
		myset.add("a");myset.add("b");myset.add("c");
		myset.add("aa");myset.add("bb");myset.add("cc");
		
		System.out.println(myset);
		
		System.out.println(myset.floor("a"));
		System.out.println(myset.ceiling("aaa"));
		System.out.println(myset.lower("a"));
		System.out.println(myset.higher("bb"));

	}

}
