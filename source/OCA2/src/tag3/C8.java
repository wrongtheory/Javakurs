package tag3;

import java.io.FileNotFoundException;
import java.io.IOException;

interface I80 {
	void m() throws IOException;
}

interface I81 {
	void m() throws FileNotFoundException;
}

public class C8 implements I80, I81 {
	@Override
	public void m() throws FileNotFoundException {
// TODO Auto-generated method stub
	}
}