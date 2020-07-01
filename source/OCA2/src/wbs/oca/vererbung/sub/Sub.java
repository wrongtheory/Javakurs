package wbs.oca.vererbung.sub;

import wbs.oca.vererbung.base.*;

public class Sub extends Base {
	
	
	
	Sub(){
		super(123);
		//Base base = new Base(321);
		n=1;
	}
	
	@Override
	protected void m() {

		System.out.println("in m() in sub");
		
		n=4;
		//super.m();
		Base b = Base.getInstance();
		
		//Base base2 = new Base();
		
		//base2.m();
		//base2.n=4;
		
		//Sub sub = new Sub();
		//sub.m();
	}
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.m();
		
		//Base base = new Base(321);
	}
	
	public void test() {
	    Base obj = new Base(123);
	}

}
