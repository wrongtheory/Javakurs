
abstract class Class1{
	public static void method1() {System.out.println("Method1 class 1");}
	public abstract void method2();
}

abstract class Class2 extends Class1{
	public abstract void method2();
}

class Class6 extends Class2{

	@Override
	public void method2() {
		System.out.println();
		
	}
	
}

class Class5 extends Class2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}

class Class3 extends Class1 {
	public void method2() {
		System.out.println("Method2 class 3");
	}
}

class Class4 extends Class3 {
	public Class4() {
		Class1.method1();
	}
	
	public void method2() {
		Class1.method1();
	}
	
	public static void method3() {
		Class1.method1();
	}
}









public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Class1.method1();
	}

}
