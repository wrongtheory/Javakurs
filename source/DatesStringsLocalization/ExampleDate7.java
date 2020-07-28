package DatesStringsLocalization;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExampleDate7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		
		Duration duration = Duration.ofHours(6);
		System.out.println(dateTime.plus(duration));
		
		System.out.println(time.plus(duration));
		
		System.out.println(date.plus(duration));

	}

}
