package DatesStringsLocalization;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Zoo_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale locale = new Locale("en", "CA");
		
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		
		System.out.println(rb.getString("hello"));
		System.out.println(". ");
		System.out.println(rb.getString("name"));
		System.out.println(" ");
		System.out.println(rb.getString("open"));
		System.out.println(" ");
		System.out.println(rb.getString("visitor"));
		
		Properties props;
		//props.get("", "")
	}

}
