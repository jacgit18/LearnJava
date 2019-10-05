package l05_Methods_Functions_100;

import java.util.Scanner;

public class MethodBasics {

	public void MethodFunction() {
		// TODO Auto-generated method stub

		int length, width;

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Length : ");
		length = input.nextInt();
		System.out.print("Enter Width : ");
		width = input.nextInt();
		int per = rectanglePerimeter(length, width);
		int area = rectangleArea(length, width);// how come the with and length
		// Aren't the same like in the rectangleArea methods
		System.out.printf("Area: %d; Perimeter: %d\n", area, per);
	}

	public static int rectangleArea(int someLength, int someWidth) {
		return someLength * someWidth;// method which needs to be static because
		// you already have a main class
	}

	public static int rectanglePerimeter(int someLength, int someWidth) {
		return 2 * (someLength + someWidth);
		/*
		 * public is the access modifier, it // could also be private, static is a
		 * optional decleration saying you can use the // method without declaring a
		 * object of the class, if static isnt used you are saying you // you must first
		 * define a object then access the method from the // object using the dot
		 * operator. the int is the data type being returned // to the method this must
		 * always be next to the name of the method // being rectanglePerimeter in this
		 * example. the parenticies contains // perameters that look like vairble
		 * declarations but are actually a // contract or promise to the sqaure method
		 * giving it a int the number isnt a vairble but a parameter coming into the
		 * method every method needs a return statement
		 */
	}

	{
		System.out.println("///////////////////////////////////////////////////\n");
	}

	{
		System.out.println("//Factorial /////////////////////////////////////");
		int n = 5;
		int result = factorial(n);
		System.out.printf("%d factorial is %d\n", n, result);
	}

	/*
	 * Calculates the factorial of a positive integer n Example factorial(4) ==
	 * 4*3*2*1 == 24
	 */
	public static int factorial(int n) {
		int temp = 0;
		temp = n <= 0 ? 1 : n * factorial(n - 1);
		return temp;
	}

	{
		System.out.println("///////////////////////////////////////////////////\n");

		System.out.println("//VariableScope /////////////////////////////////////");
		String name = "Mike";
		SayHello(name);
		name = "Bill";
		SayHello(name);
	}

	public static void SayHello(String name) {
		System.out.printf("Hello, %s\n", name);// if name="George"; was before
		// print statement it would print out George multiple times

		name = "George";

		/*
		 * public static void main(String[] args) { String name = "Mike";
		 * SayHello("Mike");// since it SayHello before("Mike") the code will step
		 * through to the next method SayHello SayHello(name); }// vairable live within
		 * this block, so it is limited
		 * 
		 * public static void SayHello( String name ) {
		 * System.out.printf("Hello, %s\n",name); name="Tony";// after SayHello("Mike");
		 * from main class runs and the print statement from this method runs then
		 * name="Tony"; will run and return to the main class to run next line of code
		 * while the value of name changes back to "Mike" causing it not exist any more
		 * } // the values in wouldnt change because its only in // this block and is
		 * following only the argument in first block // this is seen when you debug
		 */
		/*
		 * to test out uncomment put a breakpoint at line 33 with the brace that close
		 * out the block then press f7 at line 24 where it says String name = "Mike"; to
		 * test the code and pressing f8 to step through a line at a time
		 */
		System.out.println("/////////////////////////////////////////////////");
	}

}
