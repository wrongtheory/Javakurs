package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class SetupDerbyDatabase {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try{
		    //Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();// or may be it is "org.apache.derby.jdbc.EmbeddedDriver"? Not sure. Check the correct name and put it here.
		    Class.forName("org.apache.derby.jdbc.ClientDriver");// or may be it is "org.apache.derby.jdbc.EmbeddedDriver"? Not sure. Check the correct name and put it here.
		} catch(ClassNotFoundException e){
		    //handle exception
		}
		
		String url = "jdbc:derby:zoo;create=true";
		
		try (Connection conn = DriverManager.getConnection(url);
				java.sql.Statement stmt = conn.createStatement()){
			
			if(conn!=null)
				System.out.println("Connected");
			
			  stmt.executeUpdate("CREATE TABLE species (" + "id INTEGER PRIMARY KEY, " +
			  "name VARCHAR(255), " + "num_acres DECIMAL)");
			  stmt.executeUpdate("CREATE TABLE animal (" + "id INTEGER PRIMARY KEY, " +
			  "species_id integer, " + "name VARCHAR(255), " + "date_born TIMESTAMP)");
			 
			 stmt.executeUpdate("INSERT INTO species VALUES (10,'African Elephant', 7.5)");
			 stmt.executeUpdate("INSERT INTO species VALUES (22, 'Zebra', 1.2)"); 
			 stmt.executeUpdate("INSERT INTO animal VALUES (11,1,'Elsa', '2001-05-06 02:15:00')");
			 stmt.executeUpdate("INSERT INTO animal VALUES (22,2,'Zelda', '2002-08-15 09:12:00')");
			 stmt.executeUpdate("INSERT INTO animal VALUES (33,1,'Ester', '2002-09-09 10:36:00')");
			 stmt.executeUpdate("INSERT INTO animal VALUES (44,2,'Eddie', '2010-06-08 01:24:00')");
			 stmt.executeUpdate("INSERT INTO animal VALUES (55,2,'Zoe', '2005-11-12 03:44:00')");
			 
		}

	}

}
