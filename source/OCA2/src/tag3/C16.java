package tag3;

import java.io.IOException;
import java.sql.SQLException;

interface I161 {
	void m() throws IOException;
}

interface I162 {
	void m() throws SQLException;
}

public class C16 implements I161, I162 {
	@Override
	public void m() throws IOException {
// TODO Auto-generated method stub
	}
}