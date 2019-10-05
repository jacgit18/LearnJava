/* Challenge Activity 1 - Legal Drinking Age

Write a simple Java program to to do the following:

1) Input your age
2) if age less than 21 then
3)    Display a message about not being of legal drinking age
4) else
5)    Display a message about being legal drinking age

SAMPLE RUN #1: 
Enter your age : 34
You're legal. Enjoy a cold one!

SAMPLE RUN #2
Enter your age : 19
You're not of legal drinking age!

NOTE: be sure to "block out" your if else correctly! Style counts!

*/
package l08_If_Else_Statements;

import java.util.Scanner;

public class LegalDrinkingAge {

	public  void Drink() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = input.nextInt();
		if (age < 21) {
			System.out.printf("You're not of legal drinking age!\n");
		} else if (age >= 21 && age <= 100) {
			System.out.println("You're legal. Enjoy a cold one!\n");

		} else if (age >= 100) {
			System.out.println("You're dead\n");
		}
	}
}
