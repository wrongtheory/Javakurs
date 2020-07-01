package advancedClassDesign;

public class TestNameBirthDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NamesBirthDates name = NamesBirthDates.VICTOR;
		
		switch(name) {
		case VICTOR:
			System.out.print(name.VICTOR);
			NamesBirthDates.VICTOR.getBirthDate();
			NamesBirthDates.hz();
			NamesBirthDates.VICTOR.winn();
			break;
		case ION:
			NamesBirthDates.ION.getBirthDate();
			break;
		case ANDREI:
			NamesBirthDates.ANDREI.getBirthDate();
			break;
		case ELENA:
			NamesBirthDates.ELENA.getBirthDate();
		}
		
		for(NamesBirthDates names: NamesBirthDates.values())
		{
			System.out.print(names.name());
			names.getBirthDate();
		}
	}

}
