package l10_For_Loops;

import java.util.Scanner;

public class BarChartRun {

	public void Chart() {
		// TODO Auto-generated method stub
		
		   @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	        System.out.print("Enter value for A : ");
	        int a = input.nextInt();
	        System.out.print("Enter value for B : ");
	        int b = input.nextInt();
	        
	        //TODO: Call drawBarChart for a and b
	        drawBarChart(a);                
	        drawBarChart(b);                
	    }
	    
	    /**
	     * This method will print a value and its corresponding bar chart
	     * Example val =4
	     *  4: [####]
	     * @param val the value of the bar
	     * 
	     */
	    public static void drawBarChart(int val) {
	        // TODO: Write implementation here 
	        System.out.printf("%2d : [", val);
	        for(int i=1;i<=val;i++) {
	            System.out.print("#");
	        }
	        System.out.println("]");
		
	}

}
