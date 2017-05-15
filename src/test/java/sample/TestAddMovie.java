package sample;

import java.sql.SQLException;

public class TestAddMovie {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int rows = AddMovie.insert(6, 5, "2017-04-10");
		System.out.println("\n Rows Inserted " + rows);
	}

}