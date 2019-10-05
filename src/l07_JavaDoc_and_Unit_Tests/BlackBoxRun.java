package l07_JavaDoc_and_Unit_Tests;

import java.util.Scanner;

import l07_JavaDoc_and_Unit_Tests_P2.BlackBox;

public class BlackBoxRun {
	
	public void box() {
		BlackBox b = new BlackBox();
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a positive integer: ");
	    int number = input.nextInt();
	    System.out.printf("Number %d ==> %s\n",number, b.FizzBuzz(number));
	}
	
	
}
