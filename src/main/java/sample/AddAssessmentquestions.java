package sample;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class AddAssessmentquestions {

	public static int insert(final int ass_id, final int q_id) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();

		String sql = "INSERT INTO assessment_quest(assessment_id,q_id) VALUES(?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, ass_id);
		pst.setInt(2, q_id);
		int rows = pst.executeUpdate();
		return rows;

	}

}
