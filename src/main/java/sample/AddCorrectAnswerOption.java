package sample;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class AddCorrectAnswerOption {

	public static int insert(final int qid,final int ansid) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();
		
		String sql = "INSERT INTO q_correct_answers(q_id,ans_opt) VALUES(?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, qid);
		pst.setInt(2, ansid);
		int rows = pst.executeUpdate();
		return rows;
	}
}
