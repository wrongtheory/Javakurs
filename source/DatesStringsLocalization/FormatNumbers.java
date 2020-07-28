package DatesStringsLocalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumbers {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		int attendeesPerYear = 3_200_000;
		
		int attendeesPerMonth = attendeesPerYear / 12;
		
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeesPerMonth));
		
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(g.format(attendeesPerMonth));
		
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendeesPerMonth));
		
		double price = 48;
		NumberFormat us2 = NumberFormat.getCurrencyInstance(Locale.getDefault());
		System.out.println(us.format(price));
		
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		
		String s = "40.45";
		System.out.println(en.parse(s));
		System.out.println(fr.parse(s));

	}

}
