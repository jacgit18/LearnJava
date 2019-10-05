package l10_For_Loops;

import java.util.Scanner;

public class MultiplesofN {

	public void Multi() {
		// TODO Auto-generated method stub
		int maxMultiples = 10;
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want multiples of : ");
        int multiplesOf = input.nextInt();
        for (int i=1; i<=maxMultiples;i++) {
            int answer = i *multiplesOf;
            System.out.printf("%d * %d == %d\n", i, multiplesOf, answer);
        }
	}

}
