package wbs.collections;

import java.util.HashSet;
import java.util.Set;

public class CountDiffChars {

	private static String[] names = { "anna", "george", "33tillol33", "youssef", "abc123abc123ABC12333333", "anamariA",
			"55555", "...abc123...123abc..." };

	public static void Method1(String[] names) {
		for (String name : names) {
			StringBuilder chars = new StringBuilder(name);
			int count = chars.length();
			for (int i = 0; i < chars.length(); i++) {
				for (int j = i + 1; j < chars.length(); j++) {
					if (Character.toLowerCase(chars.charAt(i)) == Character.toLowerCase(chars.charAt(j))) {
						chars.deleteCharAt(j--);
						count--;
					}
				}
			}
			System.out.println(name + " " + name.length() + " => " + chars + " " + count);
		}
	}
	
	
	public static int Method2(String s) {
		Set<Character> chars = new HashSet<>();
		for(char c: s.toCharArray()) {
			chars.add(c);
		}
		return chars.size();
	}

	public static void main(String[] args) {
		Method1(names);
		
		for(int i=0;i<names.length;i++)
			System.out.println(Method2(names[i]));
	}
}
