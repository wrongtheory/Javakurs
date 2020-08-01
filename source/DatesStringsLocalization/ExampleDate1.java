package DatesStringsLocalization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;

public class ExampleDate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		LocalTime time1 = LocalTime.of(6, 15);
		LocalTime time2 = LocalTime.of(6, 15,30);
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);
		
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time3);
		LocalDateTime dateTime2 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		
		ZoneId zone  = ZoneId.of("US/Eastern");
		ZonedDateTime zoned1 = ZonedDateTime.of(2015,1,20,6,15,30,200,zone);
		System.out.println(zoned1);
		
		ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
		System.out.println(zoned2);
		
		ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);
		System.out.println(zoned3);
		
		
		System.out.println(ZoneId.systemDefault());
		
		
		ZoneId.getAvailableZoneIds().stream()
			.filter(z -> z.contains("DE") || z.contains("Germany"))
			.sorted().forEach(System.out::println);
		
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time).minusDays(1).minusHours(10).minusSeconds(30);
		
		System.out.println(dateTime);
			

	}

}
