package tag3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

interface I151 {
	void m() throws IOException;
}

interface I152 {
	void m() throws SQLException;
}

public class C15 implements I151, I152 {
	@Override
	public void m() throws IOException, FileNotFoundException {
// TODO Auto-generated method stub
	}
}