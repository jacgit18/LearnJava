package l13_Multidimensional_Arrays_P2;

/**
 * An enumeration for the tic-tac-toe markers (X and O)
 * @author mafudge
 */
public enum Marker2 {
    X ('X'), O('O'), EMPTY(' ');

    private char ch;

    Marker2(char ch) {
        this.ch = ch;
    }
    
    @Override
    public String toString() {
        return String.format("%c", this.ch);
    }
}
