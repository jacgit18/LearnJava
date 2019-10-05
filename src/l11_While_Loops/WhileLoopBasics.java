package l11_While_Loops;

public class WhileLoopBasics {

	public void Whileloopy() {
		// TODO Auto-generated method stub
		  // this demonstrates the basic while  loop for iterating a specific number of times
        int max = 10;
        int i = 1;
        
        System.out.println("Counting Up...");
        while (i <= max) {//the while loop has only a exit condition in its construct and doesnt need to be
            System.out.printf("%d ",i);// at the begining, also as i <= max is true it will continue
            // i = i + 1;// to loop and inrease because the increment at the end and eventually leave the loop
            // i += 1; // and go to next block 
            i++;
        }
        System.out.println();
        
        i = max;
        System.out.println("Counting Down...");
        while (i>=1) {
            System.out.printf("%d ",i);
            // i = i - 1;
            // i -= 1;
            i--;
        }
        System.out.println();
	}

}
