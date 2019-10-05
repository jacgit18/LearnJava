package l13_Multidimensional_Arrays;

//import java.util.Scanner;

import l13_Multidimensional_Arrays_P2.Board;
import l13_Multidimensional_Arrays_P2.Marker;
//import l13_Multidimensional_Arrays_P2.Board2;
//import l13_Multidimensional_Arrays_P2.Marker2;
//import l13_Multidimensional_Arrays_P2.Board3;
//import l13_Multidimensional_Arrays_P2.Marker3;
//import l13_Multidimensional_Arrays_P2.Board4;
//import l13_Multidimensional_Arrays_P2.Marker4;


public class _Lesson_13 {

	public static void main(String[] args) {

		Board imp = new Board();
		imp.Draw();
		imp.Place(Marker.X, 0, 1);
		imp.Place(Marker.O, 2, 1);
		imp.Draw();
		imp.Clear();
		imp.Draw();

		//////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////

//		MultiDimensionalArraysExample dime = new MultiDimensionalArraysExample();
//		dime.MultiDimensionalArrays();
		
		//////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////
		
//		Board2 b = new Board2(new Marker2[][] { 
//            { Marker2.X, Marker2.X, Marker2.X },
//            {Marker2.EMPTY, Marker2.EMPTY, Marker2.EMPTY },
//            {Marker2.O, Marker2.O, Marker2.O}
//    });
//        
//    b.Draw();
//    System.out.printf("\n%s is a winner : %s \n",Marker2.X, b.Winner(Marker2.X));
//    System.out.printf("%s is a winner : %s \n",Marker2.O, b.Winner(Marker2.O));
    

	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
    
//    Board3 d = new Board3(); 
//    int row, col;
//    boolean winner = false;
//    @SuppressWarnings("resource")
//	Scanner input = new Scanner(System.in);
//    Marker3 currentPlayer = Marker3.X;
//    System.out.printf("Let's Play Tic-Tac-Toe!!!\n\n");
//    while(true) {
//
//        // Draw Board
//        d.Draw();
//        
//        // Get input for row and column
//        System.out.printf("%s's turn! Enter Row : ",currentPlayer);
//        row = input.nextInt();
//        System.out.printf("%s's turn! Enter Col : ",currentPlayer);
//        col = input.nextInt();            
//        
//        // place marker of current player on board at row and col            
//        d.Place(currentPlayer,row,col);
//        
//        // check for winner, 
//        winner = d.Winner(currentPlayer); 
//        
//        // exit loop if winner or board full
//        if (winner || d.Full()) break;
//        
//        // Switch Players
//        currentPlayer = currentPlayer == Marker3.X ? Marker3.O : Marker3.X;
//    }
//    
//    d.Draw();
//    // check again for winner, if not it's a tie.
//    if (winner) {            
//        System.out.printf("GAME OVER. %s WINS!\n", currentPlayer);
//    } else {
//        System.out.printf("GAME OVER. It's a TIE!\n");
//    }
    
    //////////////////////////////////////////////////////////////////////
 	//////////////////////////////////////////////////////////////////////
    
    // Debug
//    Board4 ttt = new Board4();
//    ttt.Draw();
//    ttt.Place(Marker4.X, 1, 1);
//    ttt.Place(Marker4.O, 2, 0);
//    ttt.Draw();


	}

}
