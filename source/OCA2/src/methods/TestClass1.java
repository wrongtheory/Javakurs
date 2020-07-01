package methods;

public class TestClass1 {
static TestClass1 ref;
String[] arguments;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ref = new TestClass1();
		ref.func(args);
	}
	
	public void func(String[] args) {
		ref.arguments = args;
	}

}
