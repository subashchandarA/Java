package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*public class Movie
{
	public int id;
	public String mname;
}*/

public class Sql_pgm {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// insert();
		// delete("Thenali");
		// update();
		ArrayList<Movie> list = findAllMovies();
	

		for (Movie m : list) {
			System.out.println("MOVIE NAME =" + m.mname + "movie id=" + m.id);

		}
		// findMovies();

		// System.out.println("The Result Is";

	}

	public static ArrayList<Movie> findAllMovies() throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();

		String sql = "select movie_id,movie_name from movies";
		PreparedStatement pst = con.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();

		ArrayList<Movie> list = new ArrayList<Movie>();
		Movie m = new Movie();

		while (rs.next()) {
			// int movieId = rs.getInt("movie_id");
			// String movieName = rs.getString("movie_name");
			m.id = rs.getInt("movie_id");
			m.mname = rs.getString("movie_name");
			System.out.println("MovieId=" + m.id + ",MovieName=" + m.mname);
			list.add(m);
		}
		con.close();
		return (list);

	}

	public static void insert() throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.connectDB();
		String sql = "INSERT INTO movies (movie_name,release_date,language,casting) VALUES ('Kannadi2','2017-04-01','tamil','Surya');";
		PreparedStatement pst = con.prepareStatement(sql);
		int rows = pst.executeUpdate();
		System.out.println("No of rows affected" + rows);
		con.close();
	}

	public static void delete(String moviename) throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.connectDB();
		String sql = "delete from movies where movie_name ='" + moviename + "'";
		PreparedStatement pst = con.prepareStatement(sql);
		int rows = pst.executeUpdate();
		System.out.println("No of rows delected" + rows);
		con.close();
	}
}