package l05_Methods_Functions_100;

import java.util.Scanner;

public class Circles {

	public void Round() {
		// TODO Auto-generated method stub
		/**
		 * Debug Example
		 */
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Enter Circle Radius : ");
        double radius = input.nextDouble();
        double circ = circleCircumference(radius);
        double area = circleArea(radius);
        System.out.printf("Circumference : %f; Area : %f\n",circ, area);                
	}
	
	 public static double circleCircumference(double radius) {
	        return 2*Math.PI*radius;
	    }
	    
	    public static double circleArea(double radius) {
	        return Math.PI*radius*radius;  
	    }
	    
	    /*//OG With Error
		import java.util.Scanner;

		public class Circles {

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter Circle Radius : ");
		        double radius = input.nextDouble();
		        double circ = circleCircumference(radius,radius);
		        double area = circleArea(radius);
		        System.outprintf("Circumference : %d; Area : %f\n",circ, area);                
		    
		        public double circleCircumference(double radius) {
		            return 2*Math.PI*radius;
		        }
		    }
		    
		    public static double circleArea(double radius {
		         Math.PI*radius*radius;  
		    }
		}

		*/

	    
	}
	
	


