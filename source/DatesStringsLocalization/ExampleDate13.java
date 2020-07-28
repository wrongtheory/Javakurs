package DatesStringsLocalization;

import java.util.Locale;

public class ExampleDate13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		System.out.println(Locale.GERMAN);
		System.out.println(Locale.GERMANY);
		
		System.out.println(new Locale("fr"));
		System.out.println(new Locale("hi","IN"));
		
		Locale l1 = new Locale.Builder()
				.setLanguage("en")
				.setRegion("US")
				.build();
		
		Locale l2 = new Locale.Builder()
				.setRegion("us")
				.setLanguage("EN")
				.build();
		
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println(Locale.getDefault());
		
		Locale locale2 = new Locale("fr");
		Locale.setDefault(locale2);
		System.out.println(Locale.getDefault());

	}

}
