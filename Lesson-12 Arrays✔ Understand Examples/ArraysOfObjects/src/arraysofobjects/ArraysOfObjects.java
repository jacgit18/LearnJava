package arraysofobjects;

import java.util.Scanner;

public class ArraysOfObjects {

    public static void main(String[] args) {

//        // array with input
//        Scanner input = new Scanner(System.in);
//        // A bank of 5 students named grads
//        //Student[] grads = new Student[5]; 
//        // then assign
//        //grads[0] = new Student("Larry",99);
//        
//        // or explicitly define it.
//        //Student[] students = { new Student("Tom",77), new Student("Ed",84), new Student("Joe",80), new Student("Bob",96) };
//        
//        String name;
//        int grade;
//        int numstudent = 4;// use to remind me of value
//        // Original line of code mStudent[] students = new Student[4];
//        Student[] students = new Student[numstudent];
//
//        for(int i=0;i<students.length;i++) {
//            System.out.printf("Enter GRADE then NAME for student #%d ==> ",i);
//            grade = input.nextInt();
//            name = input.nextLine();
//            students[i] = new Student(name, grade);
//        }
        // array no input
        Student[] students = new Student[]{
            new Student("Tom", 77),
            new Student("Ed", 84),
            new Student("Joe", 80),
            new Student("Bob", 96)
        };

        System.out.printf("#\tStudent\tGrade\n");
        System.out.printf("-\t-------\t-----\n");

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%d\t%s\t%d\n", i, students[i].Name(), students[i].Grade());

    }
            // book problem 
            int[] days = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};

            for (int index = 0; index < 12; index++) {
                System.out.println("\nMonth " + (index + 1)// the index(0) plus one is adding to the month increment
                        + " has " + days[index]
                        + " days.");
            }
        
            /*
            Alternate Array Declaration Notation
            Java allows you to use two different styles when declaring array reference variables. The
            first style is the one used in this book, with the brackets immediately following the data
            type, as shown here:
            
            int[] numbers;
            
            In the second style the brackets are placed after the variable name, as shown here:
            
            int numbers[];
            
            Both of these statements accomplish the same thing: They declare that numbers is a reference
            to an int array. The difference between the two styles is noticed when more than one
            variable is declared in the same statement. For example, look at the following statement:
            
            int[] numbers, codes, scores;
            
            This statement declares three variables: numbers, codes, and scores. All three are references
            to int arrays. This makes perfect sense because int[] is the data type for all the
            variables declared in the statement. Now look at the following statement, which uses the
            alternate notation:
            
            int numbers[], codes, scores;
            
            This statement declares the same three variables, but only numbers is a reference to an int
            array. The codes and scores variables are regular int variables. This is because int is the
            data type for all the variables declared in the statement, and only numbers is followed by
            the brackets. To declare all three of these variables as references to int arrays using the
            alternate notation, you need to write a set of brackets after each variable name. Here is
            an example:
            
            int numbers[], codes[], scores[];
            
            The first style is the standard notation for most Java programmers, so that is the style used
            in this book.
            */
            
            /*
            Processing array elements is no different from processing other variables. For example, the
            following statement multiplies hours[3] by the variable payRate:
            
            grossPay = hours[3] * payRate;
            
            The following are examples of pre-increment and post-increment operations on
            array elements:
            
            int[] score = {7, 8, 9, 10, 11};
            ++score[2]; // Pre-increment operation
            score[4]++; // Post-increment operation
            
            When using increment and decrement operators, be careful not to use the operator on the
            subscript when you intend to use it on the array element. For example, the following
            statement decrements the variable count, but does nothing to the value stored in the array
            
            element amount[count]:
            
            amount[count--];
            */
            
            
            
    }
}
