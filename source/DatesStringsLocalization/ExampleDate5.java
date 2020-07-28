package DatesStringsLocalization;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ExampleDate5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duration daily = Duration.of(1, ChronoUnit.DAYS);
		System.out.println(daily);
		Duration hourly = Duration.of(1, ChronoUnit.HOURS);
		System.out.println(hourly);
		Duration everyMinute = Duration.of(1, ChronoUnit.MINUTES);
		System.out.println(everyMinute);
		Duration everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
		System.out.println(everyTenSeconds);
		Duration everyMilli = Duration.of(1, ChronoUnit.MILLIS);
		System.out.println(everyMilli);
		Duration everyNano = Duration.of(1, ChronoUnit.NANOS);
		System.out.println(everyNano);

	}

}
