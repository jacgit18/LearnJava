package l11_While_Loops;

import java.util.Random;
import java.util.Scanner;

public class PreTestLoopExampleGuessANumber {

	public void Preloop() {
		// TODO Auto-generated method stub

        /* Guess a number between 1 and 10!
         * Pre-Test Loop Edition.
         * Pre-Test loops are not guaranteed to execute at all
         */
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(10) +1;//between value of 1 && 10
        int guess = 0;// a guess which value is outside of line 15 range
        int attempt = 1;
        System.out.println("I'm thinking of a number between 1 and 10. What is it?!?!?");
        while (guess != number) {
            System.out.printf("Attempt %d : Your Guess ==> ",attempt);
            guess = input.nextInt();
            attempt++;
        }
        System.out.printf("Finally! You guessed it. It was %d.\n",guess);
	}

}
