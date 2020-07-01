package passjava;

class EJavaBase{
	void myMethod() throws ExceptionInInitializerError{
		System.out.println("Base");
	}
}

class EJavaDerived extends EJavaBase{
	void myMethod() throws RuntimeException{
		System.out.println("Derived");
	}
}

public class EJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EJavaBase obj = new EJavaDerived();
		obj.myMethod();
	}

}
