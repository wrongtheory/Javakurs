package passjava;

class A{
	int i;
	public A(int x) {this.i=x;}
}

public class B extends A{
	int j;
	
	public B(int x, int y) {
		super(x);
		this.j = y;
	}
	
	//B(){} // does not work
	//B(int y){j=y;} // dows not work
	//B(int y) {super(y*2);j=y;} // works
	//B(int y) {i=y;j=y*2;} // does not work
	B(int z){this(z,z);} // works
	
}
