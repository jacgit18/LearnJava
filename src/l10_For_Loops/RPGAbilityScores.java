package l10_For_Loops;

import l10_For_Loops.Die2;

public class RPGAbilityScores {

	public void Ability() {
		// TODO Auto-generated method stub
		Die2 d6 = new Die2(6,5555);    // 6 sided-die with seed 5555
        System.out.printf("Character Ability Roll:\n");
        System.out.printf("Str Int Dex Con Wis Cha\n");
        // TODO: Write for loop to roll d6 3 times for each of the 6 abilities
        for(int i=1;i<=6;i++) {
            System.out.printf("%3d ", d6.roll(3));
        }
        System.out.println();
	}

}
