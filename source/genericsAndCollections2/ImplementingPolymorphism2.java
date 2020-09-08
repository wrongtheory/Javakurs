package genericsAndCollections2;

class Primate{
	public boolean hasHair() {
		return true;
	}
}

interface HasTail{
	public boolean isTailStriped();
}

public class ImplementingPolymorphism2 extends Primate implements HasTail{

	public int age = 10;
	
	public boolean isTailStriped() {
		return false;
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementingPolymorphism2 impl = new ImplementingPolymorphism2();
		System.out.println(impl.age);
		
		HasTail hastTail = impl;
		System.out.println(hastTail.isTailStriped());
		
		Primate primate = impl;
		System.out.println(primate.hasHair());
		
		Object asObject = impl;
		
		Primate primate2 = impl;
		
		ImplementingPolymorphism2 implementingPolymorphism2 = (ImplementingPolymorphism2)primate2;
		System.out.println(implementingPolymorphism2.age);
		
		Primate primate3 = new Primate();
		ImplementingPolymorphism2 imPolymorphism2 = (ImplementingPolymorphism2)primate3; // throws java.lamg.ClassCastException
		
	}

}
