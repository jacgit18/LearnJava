package l10_For_Loops;

public class NestedForLoops {

	public void Nested() {
		// TODO Auto-generated method stub
		   // simple example of next for loops
        int max = 9;
        for(int i=0;i<=max;i++) {
            for(int j=0;j<=max;j++){
                System.out.printf("[%d,%d]",i,j);
            }
            System.out.println();
        }
	}

}
