
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}
	
}

abstract interface I1{
	void method1();
}

interface I3{
	
}

interface I4{
	
}

interface I2 extends I1,I3,I4{
	
}

interface Ex1 {
	private static void met2() {System.out.println("private static method"); met3();met2();}
	private void met1() {System.out.println("private method"); met2(); met3();met4();met1();}
	
	private static void met3() {System.out.println("private static method");}
	private void met4() {System.out.println("private method"); met2();}
}

interface Ex2 extends Ex1{
	void met2();
}

abstract class C1 implements Ex1, Ex2 {
	public void met3() {}
	protected abstract void met4();
	public void met2() {}
}

class C2 extends C1 implements Ex1, Ex2{
	public void met1(){}
	public void met4() {}
}


interface Herbivore{
	public int eatPlants(int i);
}

interface Omnivore{
	public void eatPlants();
}

interface Omnivore2{
	public void eatPlants();
}

class Bear2 implements  Omnivore, Herbivore, Omnivore2{
	public void eatPlants() {}
	public int eatPlants(int i) {return 1;}
}


interface i1{
	void eatPlants();
}

interface i2{
	void eatPlants();
}


class c1 implements i1,i2{

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub
	}
	
}


class c2{
	int m1() {return 1;}
}

class c3 extends c2{
	int m1() {return 1;}
}










