package advancedClassDesign;

// Anonymous Inner Class

// An anonymous inner class is a local inner class that does not have a name
// It is declared an instantiated all in one statement using the new keyword
// Anonymous inner classes are required to extend an existing class or implement an existing interface



public class AnonymousInnerClassExample {
	
	int a=1;
	
	abstract class SaleTodayOnly {
		abstract int dollarsOff();
	}
	
	interface SaleTomorrowOnly{
		int dollarsOff();
	}
	
	public int admission(int basePrice) {
		 SaleTodayOnly sale = new SaleTodayOnly() {
			int dollarsOff() {
				System.out.println(a);
				return 3;
			}
		};
		return basePrice - sale.dollarsOff();
	}
	
	public int addition(int price) {
		int a=1;
		SaleTomorrowOnly tomorrow = new SaleTomorrowOnly() {
			
			public int dollarsOff() {
				// a=2; compilation error, a musst be final or efectively final
				System.out.println(a);
				return 3;}
		};
		return price + tomorrow.dollarsOff();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



class Anonymous{
	interface Sale{
		int Euro();
	}
	
	public int pay() {
		return add(5, new Sale() {
			public int Euro() {return 5;}
		});
	}
	
	public int add(int price, Sale sale) {
		return price - sale.Euro();
	}
}
