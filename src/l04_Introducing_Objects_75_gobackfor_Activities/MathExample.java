package l04_Introducing_Objects_75_gobackfor_Activities;

import java.util.Random;
import java.util.Scanner;

public class MathExample {
	
	public void MathEx() {
		
		 System.out.printf("//Math Example //////////////////////////////////\n");
	        // Circle Math
	        @SuppressWarnings("resource")
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter Circle Radius : ");
	        double radius = input.nextDouble();
	        double circ = 2*Math.PI*radius;// using math library
	        double area = Math.PI*radius*radius;
	        System.out.printf("Circumfrence : %f; Area : %f\n",circ, area);   
	        System.out.printf("/////////////////////////////////////////////////\n");
	        
	        System.out.println("//RandomExample /////////////////////////////////\n");
	        // Demonstrates use of an existing class
	        //random class
	        Random generator = new Random();    // 0 is the "seed" the same seed will
	                                            // generate the same random sequence
	                                            // Random() will use a random "seed"        
	        int i = generator.nextInt(10);      // pick a random number between 0 and 9
	        System.out.println(i);
	        i = generator.nextInt(10);// java doc explains classes right click to access it
	        System.out.println(i);
	        i = generator.nextInt(10);
	        System.out.println(i); 
	        System.out.printf("/////////////////////////////////////////////////\n");
	        
	        System.out.println("//StringBuilderExample //////////////////////////\n");
	        // demonstrates StringBuilder class
	        StringBuilder sb = new StringBuilder();//uses javadoc the learn
	        sb.append("This is a test!");
	        String forward = sb.toString();//you only need (new) when creating a new object 
	        String reverse = sb.reverse().toString();// this uses the existing object 
	        // on line 7 StringBuilder
	        
	        System.out.println(forward);
	        System.out.println(reverse);
	        System.out.printf("/////////////////////////////////////////////////\n");
	        
		
	}

}
