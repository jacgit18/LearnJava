package l07_JavaDoc_and_Unit_Tests;

import l07_JavaDoc_and_Unit_Tests_P2.Rectangle;
import java.util.Scanner;

/**
 *
 * Demonstrates use of the Rectangle class
 * 
 * SAMPLE OUTPUT:
 * Enter Rectangle Length : 5
 * Enter Rectangle Width : 3
 * Area : 15; Perimeter : 16
 */
public class RectangleClassRun {

    public void run() {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("Enter Rectangle Length : ");
        rect.setLength(input.nextInt());
        System.out.print("Enter Rectangle Width : ");
        rect.setWidth(input.nextInt());        
        System.out.printf("Area : %d; Perimeter : %d\n", rect.area(),rect.perimeter());               
    }
}
