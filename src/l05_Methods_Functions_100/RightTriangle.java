package l05_Methods_Functions_100;

import java.util.Scanner;

public class RightTriangle {

	public void TriGeo() {
		// TODO Auto-generated method stub

		// calculate area, perimeter then display output.
		int sideA, sideB;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Right Triangle Side A : ");
		sideA = input.nextInt();
		System.out.print("Enter Right Triangle Side B : ");
		sideB = input.nextInt();
		double perimeter = trianglePerimeter(sideA, sideB);
		double area = triangleArea(sideA, sideB);
		System.out.printf("Area: %f; Perimeter: %f\n", area, perimeter);
	}

	/**
	 * Calculates the area of a right triangle
	 * 
	 * @param a side a length
	 * @param b side b length
	 * @return the area as a double
	 */
	public static double triangleArea(int a, int b) {
		return 0.5 * a * b;
	}

	/**
	 * Calculates the perimeter of a right triangle
	 * 
	 * @param a side a length
	 * @param b side b length
	 * @return the perimeter as a double
	 */
	public static double trianglePerimeter(int a, int b) {
		double c = Math.sqrt(a * a + b * b);
		return a + b + c;
	}

}
