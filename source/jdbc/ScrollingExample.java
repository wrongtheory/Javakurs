package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScrollingExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:derby:zoo";
		
		Connection con6 = DriverManager.getConnection(url);
		java.sql.Statement stmt6 = con6.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs6 = stmt6.executeQuery("select id from species order by id");
		rs6.afterLast();
		System.out.println(rs6.previous());
		System.out.println(rs6.getInt(1));
		System.out.println(rs6.previous());
		System.out.println(rs6.getInt(1));
		rs6.last();
		System.out.println(rs6.getInt(1));
		rs6.first();
		System.out.println(rs6.getInt(1));
		rs6.beforeFirst();
		//System.out.println(rs6.getInt(1));
		
		
	}

}
