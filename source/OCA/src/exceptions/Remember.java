package exceptions;

public class Remember {
	
	public static void think() throws Exception {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("catch");
		}
		
		finally {
			System.out.println("Exception");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			think();
	}

}
