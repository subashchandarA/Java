package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetAssessmentQuestion {

	public static ArrayList<ModelQuestion> get(int ass_id) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();

		String sql = "SELECT q.id,q.q_text,q.q_typeID,q.q_score FROM question q WHERE q.id IN (SELECT q_id FROM assessment_quest WHERE assessment_id=?)";

		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, ass_id);
		ResultSet rs = pst.executeQuery();
		int rows = 0;
		ArrayList<ModelQuestion> list = new ArrayList<ModelQuestion>();
		while (rs.next()) {
			ModelQuestion m = new ModelQuestion();
			m.qsid = rs.getInt("id");
			m.qtext = rs.getString("q_text");
			m.qtypeid = rs.getInt("q_typeID");
			m.score = rs.getInt("q_score");
			m.catext = GetAnstext.getans(m.qsid);

			list.add(m);
			rows++;
		}

		con.close();

		return (list);
	}
}