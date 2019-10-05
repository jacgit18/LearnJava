package l13_Multidimensional_Arrays_P2;

/**
 * Tic-Tac-Toe Board
 * @author mafudge
 */
public class Board4 {
    
    private Marker4[][] board;
    
    /**
     * Initializes a new Tic-Tac-Toe board (which is a 2-d array 
     * of Markers (X, O, or EMPTY)
     */
    public Board4(){
        board = new Marker4[3][3];
        this.Clear();
    }
    
    /**
     * Erases the board, called with the constructor of the class.
     */
    public final void Clear() {
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                board[i][j] = Marker4.EMPTY;
            }
        }
    }
    
    /**
     * Draws the current state of the board to System.out
     */
    public void Draw() {
        System.out.printf("\n  0 1 2\n");
        for (int i=0;i<3;i++) {
            System.out.printf("%d ",i);
            for (int j=0;j<3;j++) {
                if (j<2) {
                    System.out.printf("%s|",board[i][j]);
                } else {
                    System.out.printf("%s",board[i][j]);                
                }
            }
            System.out.printf("\n");
            if (i<2) System.out.printf("  -+-+-\n");
        }
    }
    
    /**
     * Places the marker on the board at position row and column
     * @param marker the marker to place (X or O)
     * @param row the row (0, 1 or 2)
     * @param column the column (0,1 or 2)
     */
    public void Place(Marker4 marker, int row, int column) {
        this.board[row][column] = marker;
    }
    

}
