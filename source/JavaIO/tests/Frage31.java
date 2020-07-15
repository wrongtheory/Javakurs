package JavaIO.tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Frage31 {
	
	public int getWidgetNumber(byte[] data) throws Exception {
		
		try(InputStream is = new ByteArrayInputStream(data)) {
			is.read(new byte[2]);
			if(!is.markSupported()) return -1;
			is.mark(5);
			is.read(); is.read();
			is.skip(3);
			is.reset();
			return is.read();
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		final Frage31 p = new Frage31();
		System.out.println(p.getWidgetNumber(new byte[] {1,2,3,4,5,6,7}));

	}

}
