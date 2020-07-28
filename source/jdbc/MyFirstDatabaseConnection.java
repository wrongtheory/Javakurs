package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstDatabaseConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:derby:zoo";
		
		try(Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt.executeQuery("select name from animal");
				){
			
			if(conn!=null)
			System.out.println("Connected");
			while(rs.next())
				System.out.println(rs.getString(1));
			
			//int result = stmt.executeUpdate("insert into species values(11,'Deer',3)");
			//System.out.println(result);
			
			int result = stmt.executeUpdate("update species set num_acres = num_acres + 1");
			System.out.println(result);
			
			//int result = stmt.executeUpdate("delete from species where id=11");
			//System.out.println(result);
			
			boolean isResultSet = stmt.execute("select * from species");
			if(isResultSet) {
				ResultSet rs3 = stmt.getResultSet();
				while(rs3.next()) {
				//System.out.println("ran a query");
				System.out.println(rs3.getString(1));
				System.out.println(rs3.getString(2));
				System.out.println(rs3.getString(3));
				}
			} else {
				int result2 = stmt.getUpdateCount();
				System.out.println("run a update");
			}
			
		}

	}

}
