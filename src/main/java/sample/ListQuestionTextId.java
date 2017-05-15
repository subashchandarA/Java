package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListQuestionTextId {

	public static int display(int ass_id) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();

		String sql = "SELECT q.id,q.q_text,q.q_typeID,q.q_score FROM question q WHERE q.id  NOT IN (SELECT q_id FROM assessment_quest WHERE assessment_id=?)";

		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, ass_id);
		ResultSet rs = pst.executeQuery();
		int rows = 0;

		while (rs.next()) {
			System.out.println("Question ID =" + rs.getInt("id") + " Question Text=" + rs.getString("q_text")
					+ "Quest type" + rs.getInt("q_typeID") + " Score" + rs.getInt("q_score"));
			rows++;
		}

		con.close();

		return (rows);
	}
}