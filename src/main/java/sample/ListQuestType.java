package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListQuestType {

	public static void ReturnQType() throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();

		String sql = "SELECT id , q_type FROM seed_ques_type WHERE is_active=1";
		PreparedStatement pst = con.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();

		ArrayList<ModelQuestType> list = new ArrayList<ModelQuestType>();

		while (rs.next()) {
			ModelQuestType m = new ModelQuestType();
			m.id = rs.getInt("id");
			m.qtype = rs.getString("q_type");
			System.out.println("Question Type =" + m.qtype + "   Question ID =" + m.id);
			list.add(m);
		}

		con.close();

		
		//return type;
	}
}
