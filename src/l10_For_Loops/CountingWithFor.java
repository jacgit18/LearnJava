package l10_For_Loops;

import l10_For_Loops.Die;

public class CountingWithFor {

	public void Counting() {
		// TODO Auto-generated method stub
	    int count =0;
        int trials = 5000;
        Die d = new Die(6);
        
        for(int i=0;i<trials;i++) {
            if (d.roll() == 1 ) {
                count++;
            }
        }
        
        System.out.printf("Trials: %d\n", trials);
        System.out.printf("Number of 1's: %d\n", count);
        System.out.printf("Percentage: %.3f\n", count/(double)trials);        
   
	}

}
