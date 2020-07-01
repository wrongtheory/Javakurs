
public class Strings {

	static String s;

	public static void main(String[] args) {

// indexOf() method
		
		s = "123String is an Example3 an";

		System.out.println("Foung 3 at position: " + s.indexOf('3'));
		System.out.println("Foung 3 after 5th index at position: " + s.indexOf('3', 5));
		System.out.println("Found an starting at position: " + s.indexOf("an"));
		System.out.println("Found an(after position 20) starting at position: " + s.indexOf("an", 20));

		//VowelConsonant("Hallo What are you doing");
		
// substring() method
		
		String s1 = "animals";
		
		System.out.println(s1.substring(3)); // mals
		System.out.println(s1.substring(s1.indexOf('m'))); // mals
		System.out.println(s1.substring(3,4));  //m
		System.out.println(s1.substring(3,7)); // mals
		 // System.out.println(s1.substring(3,8)); // Exception max end is index 7
		CharSequence c =  s1.subSequence(1, 5); // anima
		System.out.println(c);
		System.out.println(c.chars());
		System.out.println(c.codePoints());
		System.out.println(c.subSequence(0,1)); // n
		
		
// startsWith(), endsWith() methods
		
		System.out.println(s1.startsWith("an")); // true
		System.out.println(s1.startsWith("A")); // false
		System.out.println(s1.endsWith("s")); // true
		System.out.println(s1.endsWith("Q")); // false
		System.out.println(s1.endsWith("mals   ".trim())); //true
		System.out.println(s1.startsWith("m", 3)); // true
		
// CharSequence
		
		    CharSequence obj = "hello";
		    String str = "hello";
		    System.out.println("Type of obj: " + obj.getClass().getSimpleName());
		    System.out.println("Type of str: " + str.getClass().getSimpleName());
		    System.out.println("Value of obj: " + obj);
		    System.out.println("Value of str: " + str);
		    System.out.println("Is obj a String? " + (obj instanceof String));
		    System.out.println("Is obj a CharSequence? " + (obj instanceof CharSequence));
		    System.out.println("Is str a String? " + (str instanceof String));
		    System.out.println("Is str a CharSequence? " + (str instanceof CharSequence));
		    System.out.println("Is \"hello\" a String? " + ("hello" instanceof String));
		    System.out.println("Is \"hello\" a CharSequence? " + ("hello" instanceof CharSequence));
		    System.out.println("str.equals(obj)? " + str.equals(obj));
		    System.out.println("(str == obj)? " + (str == obj));
	
		    
// replace() method
		    
		    String s2 = "animals";
		    String s3="My name is Khan. My name is Bob. My name is Sonoo."; 
		    
		    System.out.println(s2.replace('a', 'A')); // AnimAls
		    System.out.println(s2.replace("a", "A")); // AnimAls
		    System.out.println(s2.replace("an", "HZ")); // HZimals
		    System.out.println(s2.replace('r', 'd')); //animals => r not found
		    
		    System.out.println(s3.replaceAll("is", "was"));
		    System.out.println(s2.replaceAll("a", "H"));
		    System.out.println(s3.replaceAll("\\s", ""));
		    System.out.println(s1.replaceFirst("a", "z"));
		    

		    
}
	

	
		
	
// indexOf() method Example
	public static void VowelConsonant(String s) {

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == ' '))
				continue;
			else if (s.indexOf(s.charAt(i)) > 0 && chars(s.charAt(i))) {
				System.out.println(s.charAt(i) + " is a vowel");
			} else {
				System.out.println(s.charAt(i) + " is a consonant");

			}
		}

	}

	public static boolean chars(char charachter) {

		char[] c = "aeiouAEIOU".toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] == charachter)
				return true;
			else
				continue;
		}
		return false;
	}
}
