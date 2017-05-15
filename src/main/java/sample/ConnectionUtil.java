package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection connectDB() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://35.154.162.204:3337/subash_db";
		String username = "subash";
		String password = "subash";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println(con);
		return (con);

	}

}
