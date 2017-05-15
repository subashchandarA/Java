package sample;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestAddAssessments {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Assessment Name:");
		String name = sc.nextLine();

		int row = AddAssessments.insert(name);
		System.out.println("row added" + row);

		sc.close();
	}

}