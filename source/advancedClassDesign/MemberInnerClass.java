package advancedClassDesign;


public class MemberInnerClass {
	
	private String msg = "Hi from Inner class";
	
	public class Inn{
		private String sayHi() {
			
			//public class C{}
			
			return msg;
		}
	}


	public static void main(String[] args) {
		
	MemberInnerClass m = new MemberInnerClass();
	Inn in = m.new Inn();
	String hi = in.sayHi();
	System.out.println(hi);
	}

}
