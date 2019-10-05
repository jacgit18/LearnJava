package l10_For_Loops;

public class ForLoopBasics {

	public void loopy() {
		   // this demonstrates the basic for loop for iterating a specific number of times
        int max = 10;
        System.out.println("Counting Up...");
        for ( int i =1;i<=max;i++ ) {// the for loop contains a intialiser;exit condiion; && increment || decrement
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.println("Counting Down...");
        for (int i=max; i>=1; i--) {
            System.out.printf("%d ",i);
        }
        System.out.println();		
		
		
	}

}
