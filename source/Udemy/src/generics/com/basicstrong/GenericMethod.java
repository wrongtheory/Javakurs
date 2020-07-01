package generics.com.basicstrong;

public class GenericMethod {
	
	public static <T> String concat(T data) {
		return "Data is " + data; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(concat("BasicsString"));
		System.out.println(concat(43));
	}

}
