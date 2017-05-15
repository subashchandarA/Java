package sample;

import java.sql.SQLException;
import java.util.Scanner;

public class TestAddQuest_AddAnswer {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int type = 4;
		Scanner s = new Scanner(System.in);

		switch (type) {
		case 4: {
			System.out.println("\nEnter the Question : ");
			String ques = s.nextLine();
			System.out.println("\nEnter the Answer :");
			String answ = s.nextLine();

			System.out.println("\nEnter the Score :");
			int score = s.nextInt();
			int qid = AddQuest.insert(ques, type, score);
			System.out.println("\nQuest id:" + qid);

			int ansid = AddAnswer.insert(answ, qid, score);
			System.out.println("\nAnswer id inserted " + ansid + " for question id" + qid);

			int row = AddCorrectAnswerOption.insert(qid, ansid);
			System.out.println("\n  correct answer option for qid=" + qid + " inserted ");

			break;

		}
		case 5: {

			System.out.println("\nEnter the Question: ");
			String ques = s.next();
			System.out.println("\nEnter the Score :");
			int score = s.nextInt();
			int qid = AddQuest.insert(ques, 2, score);
			System.out.println("\nQest id:" + qid);

			System.out.println("\nEnter the Answer Option 1: :");
			String answ1 = s.next();
			break;
		}

		}
		s.close();
	}
}