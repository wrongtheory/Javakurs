package advancedClassDesign;

// Member Inner Class

// A member inner class is defined at the member level of a class(the same level as the methods, instance variables and constructors)
// Member inner class has the following properties:
// - can be declared public, private, protected or use default access
// - can extend any class and implement interfaces
// - can be abstract or final
// - cannot declare static fields or methods
// - can access members of the outer class including private members

public class MemberInnerClassExample {
	
	private String greeting = "Hi";
	
	protected class Inner extends Thread implements Runnable{
		public int repeat = 3;
		public void go() {
			System.out.println(greeting);
			System.out.println(MemberInnerClassExample.this.greeting);
			for(int i=0;i<repeat;i++)
				System.out.println(greeting);
		}
	}
	
	abstract class InnerExample{
		public void access() {
			System.out.println(greeting);
		}
	}
	
	private final class FinalExample{
		public void access() {
			System.out.println(greeting);
		}
	}
	
	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberInnerClassExample m = new MemberInnerClassExample();
		m.callInner();
		Inner inner = m.new Inner();
		Inner inner2 = new MemberInnerClassExample().new Inner();
		inner.go();
		inner2.go();
		
		
		AA aa = new AA();
		AA.BB bb = aa.new BB();
		AA.BB.CC cc = bb.new CC();
		cc.allTheX();
		
		
	}

}

class AA{
	private int x = 10;
	class BB{
		private int x = 20;
		class CC{
			private int x = 30;
			
			public void allTheX() {
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(BB.this.x);
				System.out.println(AA.this.x);
			}
		}
	}
}



class CaseOfThePrivateInterface2{
	private interface Secret{
		public void shh();
	}
	
	class DontTtell implements Secret{
		public void shh() {}
	}
}
