package l04_Introducing_Objects_75_gobackfor_Activities;

import java.util.Scanner;

public class PalindromeDetector {

	public void Palindrome() {
		System.out.printf("/////////////////////////////////////////////////////////\n");


        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Enter phrase : ");
        String phrase = input.nextLine();
        StringBuilder sb = new StringBuilder(phrase);
        String reversePhrase = sb.reverse().toString();
        String result = phrase.equals(reversePhrase)
                ? "That's a palindrome!" 
                : "That's not a palindrome!";
        System.out.println(result);  
        
		System.out.printf("/////////////////////////////////////////////////////////\n");

	}

}
