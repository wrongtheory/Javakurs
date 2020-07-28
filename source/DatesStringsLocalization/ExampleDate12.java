package DatesStringsLocalization;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleDate12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 6);
		
		LocalTime time = LocalTime.of(1, 30);
		
		ZoneId zone = ZoneId.of("US/Eastern");
		
		ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
		
		System.out.println(dateTime);
		
		dateTime = dateTime.plusHours(1);
		
		System.out.println(dateTime);
		
		dateTime = dateTime.plusHours(1);
		
		System.out.println(dateTime);

	}

}
