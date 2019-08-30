/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semantic.errors.operators;

import java.util.Scanner;

/**
 *
 * @author Josué
 */
public class SemanticErrorsOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    System.out.println("//OnePlusTwoEqualsTwelve ////////////////////////////");
    
    System.out.println("//Semantic Error -Disconnect Between A Program Intent"
    + " & Actions/////////////////////////////////////");
    
    String a = "5";
    String b = "100";
    System.out.println(a + b); // not 105 instead 5100

    String firstname = "josh";
    String lastname = "carp";
    System.out.println( firstname + " " + lastname);
    //if space needed you can also add double qoutes 
    //and put space between them  
    
    // convering string to int

    //int l = "1"; gives error && wont solve concantenation problem on line 24
    int K = Integer.parseInt(a);//Integer is a class and 
    //parseInt is a static method of the class also in debug the value 
    //doesnt have qoutes
    int j = Integer.parseInt(b);
   
    System.out.println(K +j);
    // now you get the three that should have been the output for line
    // 24
    //also the reason that you couldnt just use (int i = "1";)
    //is becuase the "1" value is declared as a string so you would get a 
    //error for incompatible types  becuse your trying to make a int equal a 
    //a string value      
    // convering booleans
    String areYouHappy = "true";
    boolean ishappy = Boolean.parseBoolean(areYouHappy);
    System.out.println(ishappy);
    // convering String to double
    String gpa = "3.96";
    double gpa2 = Double.parseDouble(gpa);// gpa is declared as string 
    // so have to use gpa2
    System.out.println(gpa2 - 1.0); // wouldnt work with gpa
    System.out.println("///////////////////////////////////////////////////\n");
        
    System.out.println("//RelationalQualityConditionalOperators /////////////");
    Scanner input = new Scanner(System.in);
    // demonstrates the relational, equality and conditional operators
    System.out.print("Enter an integer value for X : ");
    int x = input.nextInt();
    System.out.print("Enter an integer value for Y : ");        
    int y = input.nextInt();

    System.out.printf(" X == Y ? %s\n", x == y);
    System.out.printf(" X != Y ? %s\n", x != y);
    System.out.printf(" X > Y ? %s\n", x > y);
    System.out.printf(" X <= Y ? %s\n", x <= y);
    System.out.printf(" X >= Y ? %s\n", x >= y);
    System.out.printf(" X < Y ? %s\n", x < y);
    System.out.printf(" X == Y ? booyah : no-dice ? %s\n", x==y? "booyah" : "no-dice");
    System.out.println("///////////////////////////////////////////////////\n");

    System.out.println("//UnderstandingTypeCasting //////////////////////////");
    // This demo will help explain type casting.
    int z = 20, v = 15, i = z / v;// int/int = a int giving 1              
    double d1 = z / v;// so now its line 17 int/int = int && line 18 = double
    //(intx, inty = inti = double)
    //  20, 15    = 20/15 = x/y gives 1.0       
    double d2 =  z/ (v * 1.0); // int / (double  * int) = double
    //this is a implicit typecast
    //to do this easier use explicit typecast
    double d3 = z / (double)v;  // int / double = double
    // this says take y as a interger convert to double && take interger x 
    // && divide so its int / double = double 
    //but it also say treat y as a double
    System.out.println(i);
    // java arithmetic operators have "type consistency"
    // the type persists accross the operation
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    //int w = 3.14;// this is a error because you can implicitly cast int 
    // into a double but not a double into a int because you will lose
    // important info about the number

    //double w = 3; //no error because you it can promote this to a 3.0

    /*
    so in conclusion its ok to say double vairable gets the value &&
    its a int  because it will be complicitly converted for you into 
    a double value but the vise versa isnt true becuase you will lose 
    percision */
    System.out.println("/////////////////////////////////////////////////////");
        
        
        
        
        
        
        
    }
    
}
