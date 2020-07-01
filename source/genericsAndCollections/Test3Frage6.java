package genericsAndCollections;




public class Test3Frage6<T> {
	
	T tr;
	
	public Test3Frage6(T t){
		this.tr = t;
	}
	
	public String toString() {
		return tr.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Test3Frage6<String>("hi"));
		System.out.println(new Test3Frage6("there"));
	}

}
