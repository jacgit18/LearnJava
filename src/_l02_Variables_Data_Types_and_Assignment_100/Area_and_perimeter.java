package _l02_Variables_Data_Types_and_Assignment_100;

import java.util.Scanner;

public class Area_and_perimeter {

	public void Area() {
		System.out.printf("/////////////////////////////////////////////////////////\n");

		// variables
		int length, width, area, perimeter;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		// inputs
		System.out.print("Enter Length : ");
		length = input.nextInt();
		System.out.print("Enter Width : ");
		width = input.nextInt();
		// calculations
		area = length * width;
		perimeter = 2 * (length + width);
		// outputs
		System.out.printf("Perimeter : %d\n", perimeter);
		System.out.printf("Area : %d\n", area);
		System.out.printf("/////////////////////////////////////////////////////////\n");


	}

}
