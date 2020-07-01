package level8;

public class Kata3 {

	static String greet(String name, String owner) {
		return name.equals(owner)? "Hello boss":"Hello guest";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String greeting = greet("Victor", "Victor2");
		System.out.println(greeting);

	}

}
