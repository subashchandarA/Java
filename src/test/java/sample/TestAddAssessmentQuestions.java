package sample;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestAddAssessmentQuestions {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);

		ListAssessmentNameId.display();
		System.out.println("Enter Assessment Id:");
		int ass_id = sc.nextInt();

		int rows= ListQuestionTextId.display(ass_id);
		
		if(rows==0)
		{System.out.println("No question available to add for the Assessment ID "+ass_id);
		}
		else
		{
		System.out.println("Enter Question Text ID:");
		int q_id = sc.nextInt();
	
		int row = AddAssessmentquestions.insert(ass_id, q_id);
		System.out.println("row added" + row);
		}
		sc.close();
	}

}