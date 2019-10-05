package l06_Custom_Classes_75_gobackfor_Activities;

import java.util.Scanner;


public class HelloYourName {

	public void WhatYourName() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        String firstName, lastName;
        System.out.print("Enter your FIRST name: ");
        firstName = input.nextLine();
        System.out.print("Enter your LAST name: ");
        lastName = input.nextLine();
        YourName yourname = new YourName(firstName, lastName);
        System.out.printf("Hello, %s!\n", yourname.fullName());
        System.out.printf("Or should I say: %s\n", yourname.nameLastFirst());        
	}

}
