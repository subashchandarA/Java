package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ListMovie {

	public static ArrayList<Movie> findAll() throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();

		String sql = "select movie_id,movie_name from movies";
		PreparedStatement pst = con.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();

		ArrayList<Movie> list = new ArrayList<Movie>();

		while (rs.next()) {
			Movie m = new Movie();
			m.id = rs.getInt("movie_id");
			m.mname = rs.getString("movie_name");
			list.add(m);
		}
		con.close();
		return (list);

	}

	public static Movie findByMovieName(final String movieName) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();

		String sql = "select movie_id,movie_name from movies where movie_name=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, movieName);
		ResultSet rs = pst.executeQuery();
		Movie m = null;

		if (rs.next()) {
			m = new Movie();
			m.id = rs.getInt("movie_id");
			m.mname = rs.getString("movie_name");
		}
		con.close();
		return (m);

	}

	public static ArrayList<Movie> findByReleaseDate() throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();

		String sql = "select movie_id,movie_name from movies";
		PreparedStatement pst = con.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();

		ArrayList<Movie> list = new ArrayList<Movie>();

		while (rs.next()) {
			Movie m = new Movie();
			m.id = rs.getInt("movie_id");
			m.mname = rs.getString("movie_name");
			list.add(m);
		}
        
		con.close();
		return (list);

	}



}