package tag3;

import java.sql.SQLException;

public class C12 {
	public static void main(String[] args) throws SQLException {
		throw Math.random() > 0.5 ? new IllegalArgumentException("abc") : new SQLException("def");
	}
}