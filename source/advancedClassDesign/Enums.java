package advancedClassDesign;

public class Enums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Season s = Season.SUMMER;
		
		System.out.println(s.name());
		System.out.println(Season.WINTER);
		System.out.println(s==Season.SUMMER);
		
		for(Season season : Season.values())
			System.out.println(season.name() + " " + season.ordinal());
		
		// if(Season.SUMMER == 2) {} // does not compile
		
		Season s1 = Season.valueOf("SUMMER");
		//Season s2 = Season.valueOf("summer");
		

		switch(s) {
		case WINTER:
			System.out.println("WINTER is comming");
			break;
		case SUMMER:
			System.out.println("SUMMER is comming");
			break;
			default:
				System.out.println("Default");
		}
		
		
		Season2.SUMMER.printExpectedVisitors();
		Season2.FALL.printExpectedVisitors();
		
		
		OnlyOne first = OnlyOne.ONCE;
		OnlyOne second = OnlyOne.ONCE;
		OnlyOne third = OnlyOne.ONCE;
		
		System.out.println(Season3.WINTER);
		Season3.FALL.printHours();
		
		Season4.SPRING.printHours();
		Season4.WINTER.printHours();
		
	}

}

enum Season {
	WINTER, SPRING, SUMMER, FALL
}


enum Season2 {
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
	
	private String expectedVisitors;
	private Season2(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
	
	@Override
	public String toString() {
		return expectedVisitors;
		
	}
	
	
	

	
}



enum OnlyOne {
	ONCE(true);
	private OnlyOne(boolean b) {
		System.out.println("constructing...");
	}
}


enum Season3{
	WINTER {
		public void printHours() {System.out.println("9am - 3pm");}
	},SPRING {
		public void printHours() {System.out.println("9am - 5pm");}
	},SUMMER {
		public void printHours() {System.out.println("9am - 7pm");}
	},FALL {
		public void printHours() {System.out.println("9am - 5pm");}
	};
	
	public abstract void printHours();
	
}


enum Season4 {
	WINTER {
		public void printHours() {System.out.println("short hours");}
	}, SUMMER {
		public void printHours() {System.out.println("long hours");}
	},SPRING, FALL;
	
	public void printHours() {System.out.println("default hours");}
}












