package l03_More_VariablesType_Casting;

import java.util.Scanner;

public class DegreesOfATriangle {

	public void Tri() {

		System.out.printf("/////////////////////////////////////////////////////////\n");
		int a1, a2, a3, sum;

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter degrees for angle 1 : ");
		a1 = input.nextInt();
		System.out.print("Enter degrees for angle 2 : ");
		a2 = input.nextInt();
		System.out.print("Enter degrees for angle 3 : ");
		a3 = input.nextInt();
		sum = a1 + a2 + a3;
		String result = sum == 180 ? "GOOD" : "BAD";
		System.out.printf("%d degrees. That's a %s triangle!\n", sum, result);

		System.out.printf("/////////////////////////////////////////////////////////\n");

	}

}
