
public class VowelOrConsonant {

	public static void main(String[] args) {
		
//		Character.toLowerCase('')
		
		String s = "dsaAdaL:Kdasd das 890312312sdfds ";
		
		for(int i=0;i<s.length();i++) {
			if(vowel(s.charAt(i)))
				System.out.println(s.charAt(i) +" -> vowel");
			else
				System.out.println(s.charAt(i) +" -> consonant");
				
		}

	}
	
	
	public static boolean vowel(char charachter) {
		char[] vowels = "aeiouAEIOU".toCharArray();
	
		for(char c: vowels)
			if(c == charachter)
				return true;
		
		return false;		
		
	}

}
