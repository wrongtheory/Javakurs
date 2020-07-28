package jdbc.tests;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Frage18 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "select name from species order by id";
		
		try(Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
			java.sql.Statement stmt = conn.createStatement();
				
				ResultSet rs = stmt.executeQuery(sql)){
					rs.absolute(0);
					rs.next();
					System.out.println(rs.getString(1));
				}
		

	}

}
