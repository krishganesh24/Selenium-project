package Week9_Challenges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class SeleniumChallenges {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Database connections//

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://13.232.48.225:3306/opentaps", "dbuser", "test@123");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select FIRST_NAME,PARTY_ID from opentaps.person");

		while(result.next()) {

			String name = result.getString("FIRST_NAME");
			String id = result.getString("PARTY_ID");
			Map<String,String> clead = new HashMap<String ,String>();
			clead.put(name, id);
			//System.out.println(name);
			System.out.println("Firstname&Leadid"+clead);

		}

		result.close();
		connection.close();
		statement.close();


	}

}
