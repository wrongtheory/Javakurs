package DatesStringsLocalization;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class ZooOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale us = new Locale("en","US");
		String language;
		Locale france = new Locale("fr","FR");
		
		printProperties(us);
		System.out.println();
		printProperties(france);
		
		

	}
	
	public static void printProperties(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		//System.out.println(rb.getString("hello"));
		//System.out.println(rb.getString("open"));
		
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k + " " + rb.getString(k))
		.forEach(System.out::println);
		
		Properties props = new Properties();
		rb.keySet().stream()
		.forEach(k -> props.put(k, rb.getString(k)));
		
		
		System.out.println(props.getProperty("notReallyAProperty"));
		System.out.println(props.getProperty("notReallyAProperty","123"));
		System.out.println(props.getProperty("hello"));
		System.out.println(props.getProperty("open"));
	}

}
