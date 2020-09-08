package functionalProgramming2.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierExample {
	
	
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		LocalDateTime time = s.get();
		
		System.out.println(time);
		
		Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
		String time2 = s1.get();
		
		System.out.println(time2);
	}

}
