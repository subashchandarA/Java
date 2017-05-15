package sample;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestListQuestType {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int type=ListQuestType.displayQType();
		System.out.println("\n The selected Question Type :"+type);
						
				
	}

}