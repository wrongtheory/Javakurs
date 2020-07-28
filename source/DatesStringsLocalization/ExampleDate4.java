package DatesStringsLocalization;

import java.time.Duration;

public class ExampleDate4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duration daily = Duration.ofDays(1);
		System.out.println(daily);
		Duration hourly = Duration.ofHours(1);
		System.out.println(hourly);
		Duration everyMinute = Duration.ofMinutes(1);
		System.out.println(everyMinute);
		Duration everyTenSeconds = Duration.ofSeconds(10);
		System.out.println(everyTenSeconds);
		Duration everyMilli = Duration.ofMillis(1);
		System.out.println(everyMilli);
		Duration everyNano = Duration.ofNanos(1);
		System.out.println(everyNano);
	}

}
