/* Challenge Activity 1 - DAD and ADD in Bigletters
 * 
 * This is a great challenge in writing and calling functions.
 * 
 * This program will print out big letters (but only "D" and "A" 
 * it it then used used to print words DAD and ADD
 */

package l05_Methods_Functions_100;

public class BigLetters {

	public void Letters() {
        PrintDAD();
        System.out.println();
        PrintADD();
    }

    public static void PrintADD() {
        //TODO: Write code to print ADD in big letters
        PrintA();
        System.out.println();
        PrintD();
        System.out.println();
        PrintD();
        System.out.println();       
    }
    
    public static void PrintDAD() {
        //TODO: Write code to print DAD in big letters
        PrintD();
        System.out.println();
        PrintA();
        System.out.println();
        PrintD();
        System.out.println();       
    }
    
    public static void PrintA() {
        // TODO: Write code to print the letter "A" in big letters
        System.out.println("  X  ");
        System.out.println(" X X ");
        System.out.println("X   X");
        System.out.println("XXXXX");
        System.out.println("X   X");
        System.out.println("X   X");
    }
    
    public static void PrintD() {
        // TODO: Write code to print the letter "D" in big letters
        System.out.println("XXX  ");
        System.out.println("X  X ");
        System.out.println("X   X");
        System.out.println("X   X");
        System.out.println("X  X");
        System.out.println("XXX");
    }
}



