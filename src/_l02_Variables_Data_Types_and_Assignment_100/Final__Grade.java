package _l02_Variables_Data_Types_and_Assignment_100;

import java.util.Scanner;

public class Final__Grade {

	public void GradeAverage() {
		System.out.printf("/////////////////////////////////////////////////////////\n");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int exam1, exam2, exam3, total, percentage;
		System.out.print("Exam 1 Score : ");
		exam1 = input.nextInt();
		System.out.print("Exam 2 Score : ");
		exam2 = input.nextInt();
		System.out.print("Exam 3 Score : ");
		exam3 = input.nextInt();
		total = exam1 + exam2 + exam3;
		percentage = 100 * total / 450;
		System.out.printf("Total points : %d\n", total);
		System.out.printf("Percentage : %d\n", percentage);
		System.out.printf("/////////////////////////////////////////////////////////\n");
	}

}
