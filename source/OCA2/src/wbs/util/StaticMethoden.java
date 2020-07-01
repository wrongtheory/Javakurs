package wbs.util;

class Base {
	
	protected int n;
	public Base() {}
	protected Base(int n) {this.n=n;}
	
	protected void m() {}
}

class Sub extends Base{
	Sub(){
		super(2);
	}
	
	protected void m() {
		
	}
	
	Base b = new Base();
	Base b2 = new Base(2);
	
}


class Base1 {
	void m() {
		System.out.println("in m() von Base1");
	}
	
	static void ms() {
		System.out.println("in ms() von Base1");
	}
}

class Sub1 extends Base1 {
	void m() {
		System.out.println("in m() von Sub1");
	}
	
	static void ms() {
		System.out.println("in ms() von Sub1");
	}
}

public class StaticMethoden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base1 b1 = new Sub1();
		b1.m();
		b1.ms();
		((Base1) b1).m();
		((Base1) b1).ms();
		((Sub1) b1).m();
	}

}
