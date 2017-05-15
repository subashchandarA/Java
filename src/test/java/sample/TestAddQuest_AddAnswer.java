package sample;

import java.sql.SQLException;
import java.util.Scanner;

public class TestAddQuest_AddAnswer {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the Question Type(1): ");
		int type = s.nextInt();
		s.nextLine();

		if(type==1)
		{
			System.out.println("\nEnter the Question : ");
			String ques = s.nextLine();
			System.out.println("\nEnter the Answer :");
			String answ = s.nextLine();

			System.out.println("\nEnter the Score :");
			int score = s.nextInt();
			s.nextLine();
			int qid = AddQuest.insert(ques, type, score);
			System.out.println("\nQuest id:" + qid);

			int ansid = AddAnswer.insert(answ, qid, score);
			System.out.println("\nAnswer id inserted " + ansid + " for question id" + qid);

			int row = AddCorrectAnswerOption.insert(qid, ansid);
			System.out.println("\n  correct answer option for qid=" + qid + " inserted ");

		}
		else
		{
			System.out.println("\n Enter the correct type: ");
		}


		s.close();
	}
}