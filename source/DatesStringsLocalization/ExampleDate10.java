package DatesStringsLocalization;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ExampleDate10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.of(2015, 5, 25);
		LocalTime time = LocalTime.of(11, 55, 00);
		
		ZoneId zone = ZoneId.of("US/Eastern");
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		
		Instant instant = zonedDateTime.toInstant();
		
		System.out.println(zonedDateTime);
		System.out.println(instant);
		
		Instant now = Instant.now();
		
		//for(int i=0;i<1000000;i++)
			//System.out.println(i);
		
		Instant later = Instant.now();
		
		Duration duration = Duration.between(now, later);
		System.out.println(duration.toMillis());
		
		Instant instant2  = Instant.ofEpochSecond(1);
		System.out.println(instant2);
		
		Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
		System.out.println(nextDay);
		
		Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
		System.out.println(nextHour);
		
		Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS);

	}

}
