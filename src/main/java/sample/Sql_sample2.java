package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Sql_sample2 {

	 Class.forName("com.mysql.cj.jdbc.Driver");
     String url ="jdbc:mysql://localhost:3306/movie_db0";
     String username="root";
     String password ="thebest";		
     			
     Connection con = DriverManager.getConnection(url,username,password);
     System.out.println(con);

     String sql ="INSERT INTO movies (movie_name,release_date,language,casting) VALUES ('Singam 4','2017-04-01','tamil','Surya');";
	    PreparedStatement pst= con.prepareStatement(sql);
	    int rows = pst.executeUpdate();
	    System.out.println("No of rows affected"+rows);

	
	
	
}
