package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import preparedStatement;

public class Sql_pgm {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// insert();
		 delete("Thenali");
		// update();
		//findAllMovies();
	}

	public static void findAllMovies() throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();

		String sql = "select movie_id,movie_name from movies";
		PreparedStatement pst = con.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int movieId = rs.getInt("movie_id");
			String movieName = rs.getString("movie_name");
			System.out.println("MovieId=" + movieId + ",MovieName=" + movieName);
		}
		// System.out.println("\nNo of rows retrieved" + );

		con.close();
	}

	public static void insert() throws ClassNotFoundException, SQLException {
		/*
		 * Class.forName("com.mysql.cj.jdbc.Driver"); String url =
		 * "jdbc:mysql://localhost:3306/movie_db0"; String username = "root";
		 * String password = "thebest";
		 * 
		 * Connection con = DriverManager.getConnection(url, username,
		 * password); System.out.println(con);
		 */
		Connection con = ConnectionUtil.connectDB();
		String sql = "INSERT INTO movies (movie_name,release_date,language,casting) VALUES ('Kannadi2','2017-04-01','tamil','Surya');";
		PreparedStatement pst = con.prepareStatement(sql);
		int rows = pst.executeUpdate();
		System.out.println("No of rows affected" + rows);
		con.close();
	}

	public static void delete(String moviename) throws ClassNotFoundException, SQLException {
		/*
		 * Class.forName("com.mysql.cj.jdbc.Driver"); String url =
		 * "jdbc:mysql://localhost:3306/movie_db0"; String username = "root";
		 * String password = "thebest";
		 * 
		 * Connection con = DriverManager.getConnection(url, username,
		 * password); System.out.println(con);
		 */
		Connection con = ConnectionUtil.connectDB();
		String sql = "delete from movies where movie_name ='" + moviename + "'";
		PreparedStatement pst = con.prepareStatement(sql);
		int rows = pst.executeUpdate();
		System.out.println("No of rows delected" + rows);
		con.close();
	}

}
