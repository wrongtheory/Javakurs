package handlingExceptions;

public class TestClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		loop:
		{
			System.out.println("Loop Lable line");
			try {
				for(; true ; i++) {
					if(i>5) break loop;
				}
			} catch(Exception e) {
				System.out.println("Exception in loop");
			}finally {
				System.out.println("In Finally");
			}
		}
	}

}
