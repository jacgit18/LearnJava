package l03_More_VariablesType_Casting;

import java.util.Scanner;

public class Basket_ball_Player_Stats {
	
	public void BallerStat() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        String playerName;
        int freeThrowAttempts, freeThrowsMade;
        int fieldGoalAttempts, fieldGoalsMade;
        System.out.print("Enter Player's Name: ");
        playerName = input.nextLine();
        System.out.print("Free throws attempted: ");
        freeThrowAttempts = input.nextInt();
        System.out.print("Free throws made: ");
        freeThrowsMade = input.nextInt();
        System.out.print("Field goals attempted: ");
        fieldGoalAttempts = input.nextInt();
        System.out.print("Field goals made: ");
        fieldGoalsMade = input.nextInt();
        double freeThrowPercentage = freeThrowsMade / (double)freeThrowAttempts;
        double fieldGoalPercentage = fieldGoalsMade / (double)fieldGoalAttempts;
        int totalPoints = freeThrowsMade + 2 * fieldGoalsMade;
        System.out.printf("%s's Stats:\n",playerName);
        System.out.printf("Total Points: %d\n", totalPoints);
        System.out.printf("Free-Throw Pct: %.2f\n",freeThrowPercentage);
        System.out.printf("Field Goal Pct: %.2f\n",fieldGoalPercentage);
		
	}

}
