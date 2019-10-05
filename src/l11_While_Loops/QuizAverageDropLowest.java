package l11_While_Loops;

import java.util.Scanner;

public class QuizAverageDropLowest {

	public void Average() {
		// TODO Auto-generated method stub
	     @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	        int count=0, grade=0, total=0, min = 100;
	        double average=0.0;
	        
	        //TODO: Implement the rest of this code...
	        
	        while (true) {
	            System.out.printf("Enter Quiz %d grade (a value between 0 and 100 or a -1 to quit) => ", count + 1);
	            grade=input.nextInt();
	            if (grade <-1 || grade > 100 ) {
	                System.out.println("Invalid Grade!");
	            } else if (grade == -1) {
	                break;
	            } else { //Acceptable grade
	                count++;
	                total += grade;
	                min = grade < min ? grade: min;
	            }
	        }
	        if (count!=0) { 
	            average = total/ (double)count; 
	            System.out.println("\nRaw Scores :");
	            System.out.printf("Quiz Count :\t%d\n",count);
	            System.out.printf("Total Points:\t%d\n",total);
	            System.out.printf("Average Grade:\t%f\n\n",average);
	            average = (total-min) / (double)(count-1);
	            System.out.println("Scores With Lowest Dropped :");
	            System.out.printf("Dropped Score :\t%d\n", min);
	            System.out.printf("Quiz Count :\t%d\n",count-1);
	            System.out.printf("Total Points:\t%d\n",total-min);
	            System.out.printf("Average Grade:\t%f\n",average);
	        } else {
	            System.out.println("No Quiz Grades Entered!");
	        }
	}

}
