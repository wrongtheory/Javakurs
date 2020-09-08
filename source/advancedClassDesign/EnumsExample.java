package advancedClassDesign;

// only public or default
enum Zile {
	LUNI, MARTI, MIERCURI, JOI, VINERI,SAMBATA,DUMINICA;
	String s;
} 

enum Zile2 {
	LUNI("Iar e luni"), 
	MARTI("Parca e mai bine"), 
	MIERCURI("Deja e jumatate"), 
	JOI("Inca putin"), 
	VINERI("Ura, Vineri"),
	SAMBATA("Ne odihnim"),
	DUMINICA("maine e iar Luni?");
	
	private String expectedActions;
	private Zile2 z = Zile2.LUNI;
	// The code does not compile with a public constructor
	private Zile2(String expectedActions) {
		this.expectedActions = expectedActions;
	}
	
	public void printExpectedActions() {
		System.out.println(expectedActions);
	}
} 


enum Zile3 {
	LUNI {
		@Override protected void printState() {
			System.out.println("Iari e luni");
		}
	}, MARTI {
		public void printState() {
			System.out.println("Luni a trecut");
		}
	}, MIERCURI {
		public void printState() {
			System.out.println("Deja e jumatate");
		} 
	}, JOI {
		public void printState() {
			System.out.println("Inca putin");
		}
	}, VINERI {
		public void printState() {
			System.out.println("Ura, Vineri!");
		}
	}, SAMBATA {
		public void printState() {
			System.out.println("Ne odihmi azi");
		}
	}, DUMINICA ;
	protected  void printState() {
		System.out.println("Default implementation");
	}
	public static void test() {}
	private int i;
	}



enum OnlyOne2{
	ONCE(true);
	private OnlyOne2(boolean b) {
		System.out.println("constructing");
	}
}

public class EnumsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zile z = Zile.JOI;
		System.out.println(Zile.JOI);
		System.out.println("======================================================");
		System.out.println(z == Zile.JOI);
		System.out.println(z.equals(Zile.JOI));
		
		System.out.println("======================================================");
		
		for(Zile zile : Zile.values())
			System.out.println(zile.name() + " " + zile.ordinal());
		
		
		// Compiler Error
		// you cannot compare an enum and int directly.
		// enum is a type and not an int
		//	if(Zile.JOI == 3) {} // does not compile
		
		System.out.println("======================================================");
		
		Zile z1 = Zile.valueOf("LUNI");
		System.out.println(z1);
		
		// Zile z2 = Zile.valueOf("luni"); // Exception in thread "main" java.lang.IllegalArgumentException: No enum constant advancedClassDesign.Zile.luni
		
		System.out.println("======================================================");
		
		Zile vineri = Zile.VINERI;
		
		switch(vineri) {
			case LUNI:
				System.out.println("Azi e luni");
				break;
			case VINERI:
				System.out.println("Ura, Vineri!");
				break;
			default:
				System.out.println("E vineri?");
				
		}
		
		// Compilation error
		/*
		 * switch(vineri) { case 0: // does not compile
		 * System.out.println("does not compile"); break; }
		 */
		System.out.println("======================================================");
		
		Zile2.LUNI.printExpectedActions();
		
		System.out.println("======================================================");
		
		OnlyOne2 firstCall = OnlyOne2.ONCE.ONCE; // prints constructing
		
		OnlyOne2 secondCall = OnlyOne2.ONCE.ONCE; // does not print anything
		
		System.out.println("======================================================");
		
		Zile3 z3 = Zile3.MARTI;
		z3.printState();
		
		Zile3.DUMINICA.printState();
		
	}

}



//	enum ExtendZile extends Zile {} // does not compile
	
