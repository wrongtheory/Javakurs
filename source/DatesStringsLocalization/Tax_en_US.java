package DatesStringsLocalization;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Tax_en_US extends ListResourceBundle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResourceBundle rb = ResourceBundle.getBundle("Tax", Locale.US);
		System.out.println(rb.getObject("tax"));

	}

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return new Object[][] {{"tax", new String("123")}};
	}

}
