package wbs.oca.vererbung.base;

public class Base {
	
	protected int n;
	
	public Base() {
		
	}

	protected Base(int n) {
		this.n = n;
	}
	
	protected void m() {
		System.out.println("in m() in Base");
	}
	
	public static Base getInstance()
	{
	   Base obj = new Base(123); // create obj of type A.
	   return obj; // returns that object by this method. No need to use 'New' kind of instantiation.
	}
}
