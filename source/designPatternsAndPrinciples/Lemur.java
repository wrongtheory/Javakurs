package designPatternsAndPrinciples;

class Primate {
	public boolean hasHair() {
		return true;
	}
}

interface HasTail {
	public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
	
	public int age = 10;
	
	public boolean isTailStriped() {
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		
		Primate primate2 = new Primate();
		//Lemur lemur2 = (Lemur)primate2; // class cast exception
		
		if(primate2 instanceof Lemur)
			lemur = (Lemur)primate2;
		else
			System.out.println("ClassCastException");
		
		Object lemurAsObject = lemur;

		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		
		// Lemur lemur2 = primate; // does not compile
		Lemur lemur3 = (Lemur)primate;
		System.out.println(lemur3.age);
	}

}
