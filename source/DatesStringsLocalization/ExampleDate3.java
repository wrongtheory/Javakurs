package DatesStringsLocalization;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class ExampleDate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate start  = LocalDate.of(2015, Month.JANUARY, 1);
		Duration duration = Duration.ofDays(1);
		LocalDate res = start.minusDays(duration.toHours());
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		
		Period period = Period.ofMonths(1);
		
		System.out.println(start.plus(period).plusDays(5));
		
		performAnimalEnrichment(start, end, period);

	}
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period p) {
		LocalDate upTo = start;
		
		while(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(p);
		}
	}

}
