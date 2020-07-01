package advancedClassDesign;


enum DaysOff{ // only public modifier is permitted
	ThanksGiving, PresidentsDay, ValentinesDay
}

public class Vacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final DaysOff input = DaysOff.ThanksGiving;
		
		switch(input) {
		default:
		case ValentinesDay:
			System.out.print(1);
		case PresidentsDay:
			System.out.print(2);
		}

	}

}
