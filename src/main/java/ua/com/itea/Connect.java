package ua.com.itea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Connect {
	Connection con;
	Statement st;
	public Connect() {
	 try {
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Obtained");
     } catch (Exception ex) {
         ex.printStackTrace();
     }
	 try {
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","Vitalina1!");
		st =  con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	List<Translation> getAllPhrases() {
		List<Translation> trans = new ArrayList<>();
		String sql = "SELECT * FROM warphrases";
		Translation heroe;
 		try {
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				heroe = new Translation(rs.getString("English"), rs.getString("Español"), rs.getString("Deutsch"));
				trans.add(heroe);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		return trans;
	}

}
