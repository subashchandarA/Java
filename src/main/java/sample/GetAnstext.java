package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetAnstext {

	public static String getans(final int q_id) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();
		String atext = null;
		String sql = "SELECT a_text FROM answeroption WHERE id IN (SELECT ans_opt FROM q_correct_answers WHERE q_id= ?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, q_id);
		ResultSet rs = pst.executeQuery();

		if (rs.next()) {
			atext = rs.getString("a_text");
		}

		con.close();

		return (atext);
	}
}