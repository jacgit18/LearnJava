package l11_While_Loops;

import java.util.Random;
import java.util.Scanner;

public class PostTestLoopExampleGuessANumber {

	public void Anumber() {
		// TODO Auto-generated method stub
		 /* Guess a number between 1 and 10!
         * Post-Test Loop Edition.
         * Post-Test loops will execute at least ONE TIME
         * useful for "sanitizing input"
         */
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(10) +1;
        int guess = 0;
        int attempt =1;
        System.out.println("I'm thinking of a number between 1 and 10. What is it?!?!?");
        do {// the do basically runs the body in the brackets and doesnt need to 
            // check for true and false to execute like with the while loop 
            System.out.printf("Attempt %d : Your Guess ==> ",attempt);
            guess = input.nextInt();  
            attempt++;
        } while (guess != number);
        System.out.printf("Finally! You guessed it. It was %d.\n",guess);
	}

}
