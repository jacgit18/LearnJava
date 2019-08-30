package ifelsestatement;

import java.util.Scanner;

public class IfElseStatement {

    /**
     * A Simple demonstration of the if and if else statements
     */
    public static void main(String[] args) {
    
    System.out.println("// If-Else/////////////////////////////////////////");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your grade a number between 0 & 100) : ");
    int grade = input.nextInt();
    // created a int vairable while having input value
    if(grade >=0 && grade <=100){// also technically a boolean
    // this is logical and is used when you need the grade >=0 and the 
    //grade <=100 to be true
    if(grade<70) // this is a if within a if statement
    {
    System.out.println("you're not a very bright student!");
    } else {
    System.out.printf("%d is a nice grade!\n",grade);
    } // %d is the value of int grade vairable
    } else {
    System.out.printf("The value %d is outside the range 0 to 100\n",grade);
    }
    // to dedug across classes press f7 to start debug and continue pressing f7 
    //until you reach the  line you want to step over, then press f8 to step 
    //over one line at a time 
    
    System.out.println("///////////////////////////////////////////////////");
    
    }
}
