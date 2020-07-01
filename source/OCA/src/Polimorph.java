
class Primate{
	public boolean hasHair() {
		return true;
	}
}

interface HasTail{
	boolean isTailStriped();
}


public class Polimorph extends Primate implements HasTail {

	public boolean isTailStriped() {
		return false;
	}
	
	public int age = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polimorph p = new Polimorph();
		System.out.println(p.age);
		
		HasTail hasTail = p;
		System.out.println(hasTail.isTailStriped());
		
		Primate primate = p;
		Polimorph p2 = (Polimorph)primate;
		System.out.println(primate.hasHair());
		
		Object obj = p;
		System.out.println(obj.toString());
	}

}
