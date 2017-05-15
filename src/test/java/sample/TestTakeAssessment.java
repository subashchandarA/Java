package sample;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestTakeAssessment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);

		ListAssessmentNameId.display();
		System.out.println("Enter Assessment Id:");
		int ass_id = sc.nextInt();
		sc.nextLine();
		ArrayList<ModelQuestion> list = GetAssessmentQuestion.get(ass_id);
		int score = 0, totalscore = 0;
		if (list.size() == 0) {
			System.out.println("No question available for the Assessment ID " + ass_id);
		} else {
			for (ModelQuestion m : list) {
				System.out.println("Question:" + m.qtext);
				System.out.println("Enter the  Answer:");
				totalscore = totalscore + m.score;
				m.atext = sc.nextLine();
				if (m.atext.equalsIgnoreCase(m.catext)) {
					System.out.println("Correct Answer:");
					score = score + m.score;
				} else
					System.out.println("Wrong Answer:");
			}

			System.out.println("Assessment mark Scored:" + score + ",Out of " + totalscore);

		}
		sc.close();
	}

}