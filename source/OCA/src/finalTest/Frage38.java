package finalTest;

public class Frage38 {
	static interface Target{
		boolean neetToAim(double angle);
	}
	
	static void prepare(double angle, Target f) {
		boolean ready = f.neetToAim(angle);
		System.out.println(ready);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			prepare(45, d-> d>5 || d<-5);
	}

}
