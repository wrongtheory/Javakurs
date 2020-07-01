package finalTest;

public class Test2Frage8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder("Leaves growing");
		
		do {
			builder.delete(0, 5);
		} while(builder.length()>5);

		System.out.println(builder);
		
		builder.insert(0, "gro");
		System.out.println(builder);
		
		builder.insert(0, "Leavse ");
		System.out.println(builder);
	}

}
