package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScrollingExample2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
		String url = "jdbc:derby:zoo";
		
		Connection con = DriverManager.getConnection(url);
		java.sql.Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		String sql;
		ResultSet rs = stmt.executeQuery("select id from animal order by id");
		
		System.out.println(rs.absolute(2));
		System.out.println(rs.getString("id"));
		System.out.println(rs.absolute(0));
		System.out.println(rs.absolute(5));
		System.out.println(rs.getString("id"));
		System.out.println(rs.absolute(-2));
		System.out.println(rs.getString("id"));
		System.out.println("===============================================");
		rs.absolute(0);
		System.out.println(rs.next());
		System.out.println(rs.getString("id"));
		System.out.println(rs.relative(2));
		System.out.println(rs.getString("id"));
		System.out.println(rs.relative(-1));
		System.out.println(rs.getString("id"));
		System.out.println(rs.relative(5));
		rs.beforeFirst();
		rs.afterLast();
		
		
	}

}
