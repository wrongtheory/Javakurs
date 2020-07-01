package tag3;

import java.io.IOException;
import java.sql.SQLException;

interface I171 {
	void m() throws IOException;
}

interface I172 {
	void m() throws SQLException;
}

public class C17 implements I171, I172 {
	@Override
	public void m() throws RuntimeException  {
// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		new C17().m();
	}
}
