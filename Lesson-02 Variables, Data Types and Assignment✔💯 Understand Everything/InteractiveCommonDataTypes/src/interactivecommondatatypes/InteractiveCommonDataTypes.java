package interactivecommondatatypes;

import java.util.Scanner; // Bring in the scanner to read input

/**
 *
 * @author mafudge
 */
public class InteractiveCommonDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("//Scanner Input Examples ////////////////////////////");
    // to prevent warning: [options] bootstrap class path not set in conjunction 
    // with -source 1.7 before adding and running anything, clean build project 
    //by pressing hammer\broom button
    
    Scanner input = new Scanner(System.in);    
    /*
    the name of the varible is input, the type of the varible is scanner which 
    is the class. so the statements says you created a input object of type 
    scanner and that equals a new scanner using (system.in) you need to import 
    java util. scaaner after typing in just press alt enter or to fix all 
    imports press  crtl + Shift + I
    */
    
    // declare our variables
    String studentName,heshe; /* qoues are for string data types and 
    is actually a object*/
    double gpa;//pay attention to input order and value type
    int age, retirement = 70, daystill;
    boolean isFemale; // be aware if data type equal something 

    //inputs 
    System.out.print("Enter student's name : ");
    studentName = input.nextLine();// this assigns name to the input on the line
    System.out.print("Enter student's age : ");
    age = input.nextInt(); // after next pay attention to data types
    System.out.print("Enter student's gpa : ");
    gpa = input.nextDouble();// also pay attetion for capitalization 
    System.out.println("Are you Female ? (true/false) : ");
    isFemale = input.nextBoolean();
    heshe = isFemale ? "She" : "He"; 
    /*output
    josh is 23 years old, He has a 2.700 gpa.
    BUILD SUCCESSFUL (total time: 1 minute 4 seconds)
    */
    daystill = retirement - age;// must edit print statement now
    /*
    to get rid of the zeros in the output gpa 2.700000, put 4.3 between 
    "%f" and it should look like this (%4.3f). 4 being the number 
    of digits in the gpa and three being  the number of digits to the right 
    after the decimal.
    */
    //output format of input 

    /*before edit 
    System.out.printf("%s is %d years old, " + "%s has a %4.3f gpa.\n", 
                    name, age, name, gpa);
    */                      

    System.out.printf("%s is %d years old (%d years till retirement), " + 
             "%s has a %4.3f gpa.\n", 
             studentName, age, daystill, heshe, gpa); 

    /*
    the brackets for "(%d years to retirement)" are in place because the d% 
    or age if you want to add retirement you would do the same
    */
             
    /* format specifiers %s = string %d = int %f = double each variable 
    matches up with th percent and letter if you look at the order*/

    /* before %f gpa 
    josh is 23 years old, josh has a 2.700000 gpa.
     BUILD SUCCESSFUL (total time: 0 seconds)*/

    /* after %4.3f gpa 
    josh is 23 years old, josh has a 2.700 gpa.
     BUILD SUCCESSFUL (total time: 0 seconds)*/
    
    /*
        print
            plain output no carriage return
        println
            plain output with carriage return at the end
        printf
            %f used for double
            %s used for Strings
            %d used for integer
            formatted output without carriage return
        */
        System.out.println("///////////////////////////////////////////////\n");
    
        System.out.println("//Arithmetic Operator ///////////////////////////");
        // Demonstrates basic arithmetic operators
        int x,y, result;
        System.out.print("Enter value for X : ");
        x = input.nextInt();
        System.out.print("Enter value for Y : ");
        y = input.nextInt();
        
        result = x + y;
        System.out.printf(" X + Y = %d\n", result );                
        result = x - y;
        System.out.printf(" X - Y = %d\n", result );
        result = x * y;
        System.out.printf(" X * Y = %d\n", result );
        result = x / y;
        System.out.printf(" X / Y = %d\n", result );
        result = x % y;
        System.out.printf(" X mod Y = %d\n", result );
        System.out.println("/////////////////////////////////////////////////");

    }
}


