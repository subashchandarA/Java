package sample;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class AddMovie {

	public static int insert(final int a,final int b,final String s) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();
		LocalDate rd = LocalDate.now();

		String sql = "INSERT INTO theatre_movies(branch_id,movie_id,start_date) VALUES(?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setObject(3, rd);
		pst.setInt(1, a);
		pst.setInt(2, b);
		int rows = pst.executeUpdate();
		return rows;
			}
}
