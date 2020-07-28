package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class ResultSetDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:derby:zoo";
		
		Map<Integer, String> idToNameMap = new HashMap<>();
		
		String sql;
		try(
				Connection con = DriverManager.getConnection(url);
				java.sql.Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select id, name from species");
				){rs.updateInt(1, 1);rs.updateRow();
			while(rs.next()) {
				//int id = rs.getInt("id");
				//String name = rs.getString("name");
				int id = rs.getInt(1);
				String name = rs.getString(2);
				idToNameMap.put(id, name);
				
				
			}
			
			System.out.println(idToNameMap);
		}

		try(
				Connection con2 = DriverManager.getConnection(url);
				java.sql.Statement stmt2 = con2.createStatement();
				ResultSet rs2 = stmt2.executeQuery("select date_born from animal where name = 'Elsa'")){
			if(rs2.next()) {
			Date sqldate = rs2.getDate(1);
			LocalDate localDate = sqldate.toLocalDate();
			System.out.println(localDate);
			}
			
			
			try(
					Connection con3 = DriverManager.getConnection(url);
					java.sql.Statement stmt3 = con3.createStatement();
					ResultSet rs3 = stmt3.executeQuery("select date_born from animal where name = 'Elsa'")){
				if(rs3.next()) {
				Time sqlTime = rs3.getTime(1);
				LocalTime localTime = sqlTime.toLocalTime();
				System.out.println(localTime);
				}
				
				try(
						Connection con4 = DriverManager.getConnection(url);
						java.sql.Statement stmt4 = con3.createStatement();
						ResultSet rs4 = stmt4.executeQuery("select date_born from animal where name = 'Elsa'")){
					if(rs4.next()) {
					Timestamp sqlTimestamp = rs4.getTimestamp(1);
					LocalDateTime localDateTime = sqlTimestamp.toLocalDateTime();
					System.out.println(localDateTime);
					}
		}
				
				ResultSet rs5 = stmt3.executeQuery("select id, name from species");
				while(rs5.next()) {
					Object idField = rs5.getObject("id");
					Object nameFiled = rs5.getObject("name");
					if(idField instanceof Integer) {
						int id = (Integer) idField;
						System.out.println(id);
					}
					
					if(nameFiled instanceof String) {
						String name = (String) nameFiled;
						System.out.println(name);
					}
				}
				
			
		
	}
	}
}
}