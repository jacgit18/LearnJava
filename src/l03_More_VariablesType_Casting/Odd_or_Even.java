package l03_More_VariablesType_Casting;

import java.util.Scanner;

public class Odd_or_Even {

	public void MathGang() {
		System.out.printf("/////////////////////////////////////////////////////////\n");
		/**
		 * Debug Example
		 */
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		int i = input.nextInt();
		String result = i % 2 == 0 ? "EVEN" : "ODD";
		System.out.printf("%d is %s\n", i, result);

		/*
		 * Original errors import java.util.Scanner
		 * 
		 * public class OddOrEven {//mising semi colon ;
		 * 
		 * public static void main(String[] args) { Scanner input = new
		 * scanner(System.in); System.out.print "Enter an integer : "; int i =
		 * input.nextInt(); string result = i%3 == 0 ? "EVEN" : "ODD";
		 * System.out.println("%d is %s\n",i,result);
		 */
		System.out.printf("/////////////////////////////////////////////////////////\n");
	}

}
