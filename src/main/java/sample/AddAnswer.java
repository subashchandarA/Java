package sample;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class AddAnswer {

	public static int insert(final String ans,final int qid,final int score) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();
		
		String sql = "INSERT INTO answeroption(a_text,q_textID,q_score) VALUES(?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1,ans);
		pst.setInt(2, qid);
		pst.setInt(3, score);
		int rows = pst.executeUpdate();
	
		
		String sqlid = "SELECT * FROM answeroption WHERE a_text=?";
		PreparedStatement pstid = con.prepareStatement(sqlid);
		pstid.setString(1,ans);
		ResultSet rs = pstid.executeQuery();

		int ansid=0;
		if (rs.next())
			ansid = rs.getInt("id");

		return ansid;
		
		
	}
}
