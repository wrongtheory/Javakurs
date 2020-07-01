package exceptions;

public class Fortress {
	
	public void openDrawbridge() throws Exception {
		try {
			throw new Exception("Circle");
		} catch(Exception e) {
			System.out.println("Opening");
		} 
		finally {
			System.out.println("Walls");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			new Fortress().openDrawbridge();
	}

}
