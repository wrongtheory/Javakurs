package handlingExceptions;

public class Frage6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frage6 f = new Frage6();
		f.factorial(5);
		f.printMe(args);
		f.m1();
		f.m2();
		
	}
	
	int factorial(int n) {
		if(n==1) return 1;
		else
			return n*factorial(n-1);
	}
	
	void printMe(Object[] oa) {
		for(int i=0; i<oa.length;i++)
			System.out.println(oa[i]);
	}
	
	Object m1() {
		return new Object();
	}
	
	void m2() {
		String s = (String) m1();
	}

}
