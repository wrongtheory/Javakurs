package handlingExceptions;

public class FinallyTest_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			if(args.length == 0) return;
			else
				throw new Exception("Some Exception");
		}catch(Exception e) {
			System.out.println("Exception in Main");
		}finally {
			System.out.println("The end");
		}
		
	}

}
