package handlingExceptions;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1;
		
		try {
			int i = doIt() / (j=2);
		}catch(Exception e) {
			System.out.println(" j = " + j);
		}

	}

	public static int doIt() throws Exception {throw new Exception("Forget it");}
	
}
