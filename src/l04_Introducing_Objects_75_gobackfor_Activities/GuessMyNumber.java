package l04_Introducing_Objects_75_gobackfor_Activities;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

	public void Guess() {

		System.out.printf("/////////////////////////////////////////////////////////\n");
		/**
		 * Debug Example
		 */
		int number, guess;
	        @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	        Random generator = new Random();
	        number = generator.nextInt(6)+1;
	        System.out.print("Pick a number between 1 and 5 : ");
	        guess = input.nextInt();
	        String result = guess == number ? "You guessed it!\n" : "So close it was %d\n";
	        System.out.printf(result,number);
	        
	        /*Original Error
	        public static void main(String[] args {// missing a sign  ")"

	        int number, guess;
	        Scanner input = new Scanner(System.in);
	        Random generator = random();
	        number = generator.nextInteger(5);
	        system.out.print("Pick a number between 1 and 5 : ")
	        guess = input.nextInt();
	        string result = guess == number ? "You guessed it!\n" : "So close it was %d\n";
	        System.out.printf(result,number)
	        */        

		System.out.printf("/////////////////////////////////////////////////////////\n");

	}

}
