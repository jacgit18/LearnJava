package l06_Custom_Classes_75_gobackfor_Activities;

import java.util.Scanner;


public class EZTipCalc {

	public void TipCalc() {
		/**
		 * Debug Example
		 */		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        TipCalc tc = new TipCalc();
        System.out.print("Enter Bill Amount : ");
        tc.setBillAmount(input.nextDouble());
        System.out.print("Enter Bill Tip Pct : ");
        tc.setTipPct(input.nextDouble());
        System.out.printf("\n===== Tip Calc =====\n");
        System.out.printf("Bill Amount.. %f\n", tc.getBillAmount());
        System.out.printf("Tip Pct...... %f\n", tc.getTipPct());
        System.out.printf("Tip Amount... %f\n", tc.tipAmount());
        System.out.printf("Bill Total... %f\n", tc.billTotal());
        
        /*OG code with errors
    package eztipcalc;

    import java.util.Scanner;

    public class EZTipCalc {

        public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          TipCalc tc = new TipCalc();
          System.out.print("Enter Bill Amount : ");
          tc.setBillAmount(input.nextDouble());
          System.out.print("Enter Bill Tip Pct : ");
          tc.setTipPct(input.nextDouble());
          System.out.printf("\n===== Tip Calc =====\n");
          System.out.printf("Bill Amount.. %f\n", tc.getTipPct());
          System.out.printf("Tip Pct...... %f\n", tc.total());
          System.out.printf("Tip Amount... %f\n", tc.tipAmount(9));
          System.out.printf("Bill Total... %f\n", tc.billTotal);

    }
}

        */
	}

}
