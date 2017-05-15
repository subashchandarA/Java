package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection connectDB() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/quiz_db";
		String username = "root";
		String password = "thebest";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println(con);
		return (con);

	}

}
