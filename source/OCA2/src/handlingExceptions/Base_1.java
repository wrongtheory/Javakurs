package handlingExceptions;

public class Base_1 {

	void method1() throws java.io.IOException, NullPointerException {
		someMethod("arguments");
	}
	
	int someMethod(String str) {
		if(str==null) throw new NullPointerException();
		else
			return str.length();
	}
}


class NewBase extends Base_1 {
	void method1()  {
		someMethod("args");
	}
}