package l05_Methods_Functions_100;

import java.util.Random;

public class RollTheDice {

	public void Roulette() {
		// TODO Auto-generated method stub
		
		  // print results NOTE: be sure to call the roll() doubles() and total() methods
        int d1 = roll();
        int d2 = roll();
        String diceDoubles = doubles(d1,d2) ? "doubles" :"";
        int diceTotal = total(d1,d2);
        System.out.printf("Dice Roll : %d,%d; %s total==%d\n",d1,d2,diceDoubles, diceTotal);
    }
    
    /**
     * Simulate a six-sided dice roll by generating a random number
     * between 1 and 6 and returning its value.
     * @return an integer value between 1 and 6 
     */
    public static int roll() {
        // TODO: Generate a random number between 1 and 6 then return the value
        Random numberGenerator = new Random();
        int value = numberGenerator.nextInt(6)+1;
        return value;
    }
    
    /**
     * This function returns true when both dice d1 and d2 are the same
     * @param d1 the value of the first die
     * @param d2 the value of the second die
     * @return true/false based on whether d1 equals d2
     */
    public static boolean doubles(int d1, int d2) {
        // TODO: return when dice are the same number for d1 and d2
        return d1==d2;
    }
    
    /**
     * This function returns the total values of d1 and d2
     * @param d1 the value of the first die
     * @param d2 the value of the second die
     * @return total value of the dice
     */
    public static int total(int d1, int d2) {
        // TODO: return the total value of the dice
        return d1+d2;
    }
		
	

}
