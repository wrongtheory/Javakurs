package generics.com.basicstrong;

import java.util.List;

public class Box<T> {
	
	private List<T> a;

	public Box(List<T> a) {
		this.a = a;
	}
	
	public List getA() {
		return a;
	}

	public void setA(List a) {
		this.a = a;
	}
	
	
	

}
