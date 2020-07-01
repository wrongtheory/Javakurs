package genericsAndCollections;

public class Gen<T> {
	
	T obj;
	
	public Gen(T obj) {
		this.obj = obj;
	}
	
	public void show() {
		System.out.println("The type of obj is " + obj.getClass().getName());
	}
	
	public T getObj() {
		return obj;
	}

}
