package igorHost.flashcards;

public class Test1 extends Base{

	Test1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		Double d = (double)10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}


class Base {
	String name = "";
	Base(String name) {
		this.name = name;
	}
	
	 void a() {}
}

class Test extends Base {
	
	String test = "Test";
	static String best = "Best";
	
	String run() {return test;}
	static String walk() {return best;}
	
	Test(){
		//super(test);  Cannot refer to an instance field test while explicitly invoking a constructor
		// super(best); OK
		//super(run()); Cannot refer to an instance method while explicitly invoking a constructor
		super(walk()); // OK
	}
}
