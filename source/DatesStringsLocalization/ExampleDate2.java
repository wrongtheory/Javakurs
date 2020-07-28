package DatesStringsLocalization;

import java.time.LocalDate;
import java.time.Month;

public class ExampleDate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);

		performAnimalEnrichment(start, end);
		
	}
	
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		
		while(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1);
		}
	}

}
