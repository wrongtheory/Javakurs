
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;



public class DateTime {

	public static void main(String[] args) {
		
	    
		
		System.out.println(LocalDate.now());
		
		System.out.println(LocalTime.now());
		
		System.out.println(LocalDateTime.now());
		
		LocalDate date1 = LocalDate.of(2020, Month.APRIL, 10);
		LocalDate date2 = LocalDate.of(2020, 4, 10);
		
		System.out.println(date1);
		System.out.println(date2);
		
		LocalTime time1 = LocalTime.of(12, 15);
		System.out.println(time1);
		
		LocalTime time2 = LocalTime.of(12, 15,30);
		System.out.println(time2);
		
		LocalTime time3 = LocalTime.of(12, 16,30,300);
		System.out.println(time3);
		
		
		LocalDateTime dateTime1 = LocalDateTime.of(2020, Month.APRIL, 12, 17, 15, 30);
		System.out.println(dateTime1);
		
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime2);
		
		
		LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 20);
		
		System.out.println(date);
		
		date = date.plusDays(10);
		System.out.println(date);
		
		date = date.plusWeeks(1);
		System.out.println(date);
		
		date = date.plusMonths(1);
		System.out.println(date);
		
		date = date.plusYears(5);
		System.out.println(date);
		
		date.plusYears(5);     // does not modify the date
		System.out.println(date); 
		
		
		LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time4 = LocalTime.of(5, 15);
		
		LocalDateTime ldt = LocalDateTime.of(date4, time4);
		System.out.println(ldt);
		
		ldt = ldt.minusDays(1);
		System.out.println(ldt);
		
		ldt = ldt.minusHours(10);
		System.out.println(ldt);
		
		ldt = ldt.minusSeconds(30);
		System.out.println(ldt);
		
		LocalDate date5 = LocalDate.of(2020, Month.JANUARY, 20);
		date.plusDays(10);
		System.out.println(date5);
		
		
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1);
		
		performAnimalEnrichment(start, end, period);
		
		
		
		Period annually = Period.ofYears(1); // every 1 year
		Period quarterly = Period.ofMonths(3); // every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		Period everyOtherDay = Period.ofDays(2); // every 2 days
		Period everyYearAndWeek = Period.of(1, 0, 7); // every year and 7 days
		

		Period wrong2 = Period.ofYears(1).ofWeeks(1);
		
		System.out.println("wrong2= " + wrong2);
		
		Period wrong = Period.ofYears(1);
		wrong = Period.ofWeeks(1);
		
		System.out.println("wrong= " + wrong);
		
		
		
		LocalDate d = LocalDate.of(2015, 1, 20);
		LocalTime t = LocalTime.of(6, 15);
		LocalDateTime ldt2 = LocalDateTime.of(d, t);
		
		Period p = Period.ofMonths(1);
		System.out.println(d.plus(p));
		System.out.println(ldt2.plus(p));
		
		// System.out.println(t.plus(p)); // UnsupportedTemporalTypeException
		
		
		
		LocalDate d1 = LocalDate.of(2020, Month.JANUARY, 20);
		
		System.out.println(d1.getDayOfWeek()); // MONDAY
		System.out.println(d1.getMonth()); // JANUARY
		System.out.println(d1.getYear()); //2020
		System.out.println(d1.getDayOfYear()); // 20
		
		
		
		LocalDate d2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime t2 = LocalTime.of(11, 12, 34);
		LocalDateTime ldt3 = LocalDateTime.of(d2, t2);
		
		System.out.println(d2.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(t2.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(ldt3.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(ldt3));
		System.out.println(shortDateTime.format(d2));
		// System.out.println(shortDateTime.format(t2));
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		System.out.println(ldt.format(dtf));
		System.out.println(d2.format(dtf));
		//System.out.println(t2.format(dtf));
		
		
		
		LocalDate d6 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime t6 = LocalTime.of(11, 12, 34);
		LocalDateTime ldt6 = LocalDateTime.of(d6, t6);
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		
		System.out.println(shortF.format(ldt3));
		
		System.out.println(mediumF.format(ldt3));
		
		
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(ldt3.format(f));
		
		
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
		
		LocalDate loc = LocalDate.parse("01 02 2015", f2);
		LocalTime ltime = LocalTime.parse("11:22");
		
		System.out.println(loc);
		System.out.println(ltime);
		
	}
	
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		
		while(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}
	}

}
