package sample;

import java.sql.SQLException;
import java.util.ArrayList;

public class TestListMovie {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ArrayList<Movie> movieList = ListMovie.findAll();
		for (Movie m : movieList) {
			System.out.println("Movie Name=" + m.mname + "   Movie ID =" + m.id);
		}

		String movieName = "Pandi";
		Movie m = ListMovie.findByMovieName(movieName);
		System.out.println("\n\nMovie Name=" + m.mname + "  Movie ID =" + m.id);

		String mDate = "2017-04-01";
		ArrayList<Movie> movieList1 = ListMovie.findByReleaseDate(mDate);
		for (Movie m1 : movieList1) {
			System.out.println("Movie Name=" + m1.mname + "   Movie ID =" + m1.id);
		}

	
	
	}

}