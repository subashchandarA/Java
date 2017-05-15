package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListAssessmentNameId {

	public static void display() throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connectDB();

		String sql = "SELECT id , name FROM assessments";
		PreparedStatement pst = con.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			System.out.println("Assessment ID =" + rs.getInt("id") + "   Name  =" + rs.getString("name"));
		}

		con.close();
	}
}