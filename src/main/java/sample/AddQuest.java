package sample;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class AddQuest {

	public static int insert(final String str, final int a, final int b) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();
		
		String sql = "INSERT INTO question(q_text,q_typeID,q_score) VALUES(?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, str);
		pst.setInt(2, a);
		pst.setInt(3, b);
		pst.executeUpdate();

		String sqlid = "SELECT * FROM question WHERE q_text=?";
		PreparedStatement pstid = con.prepareStatement(sqlid);
		pstid.setString(1,str);
		ResultSet rs = pstid.executeQuery();

		int qid=0;
		if (rs.next())
			qid = rs.getInt("id");

		return qid;

	}

}
