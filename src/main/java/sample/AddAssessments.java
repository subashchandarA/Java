package sample;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class AddAssessments {

	public static int insert(final String str) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();
		
		String sql = "INSERT INTO assessments(name) VALUES(?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, str);
		int rows=pst.executeUpdate();
		return rows;

	}

}
