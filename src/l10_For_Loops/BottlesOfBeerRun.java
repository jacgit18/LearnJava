package l10_For_Loops;
public class BottlesOfBeerRun {

    /**
     * demonstrates the for loop, with the classic song...
     */
    public void Beer( ) {
       for(int i=99;i>0;i--) {
           System.out.printf("%d bottles of beer on the wall, ",i);
           System.out.printf("%d bottles of beer. If one of those bottles should happen to fall, ",i);
           System.out.printf("%d bottles of beer on the wall!\n",i-1);
       }
    }
}
