package l03_More_VariablesType_Casting;

import java.util.Scanner;

public class AreaOfATriangle {

	public void Area2() {
		System.out.printf("/////////////////////////////////////////////////////////\n");

		int base, height;
		double area;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter triangle base : ");
		base = input.nextInt();
		System.out.print("Enter triangle height : ");
		height = input.nextInt();
		area = (base * (double) height) / 2;
		System.out.printf("Triangle area : %.1f\n", area);

		System.out.printf("/////////////////////////////////////////////////////////\n");

	}

}
