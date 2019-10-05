package l11_While_Loops;

import l11_While_Loops_P2.Actor;
import l11_While_Loops_P2.Die;
import l11_While_Loops_P2.Weapon;

public class DungeonHackRun {

	public void DungeonHack() {
		// TODO Auto-generated method stub
		
		/**
	     * The beginnings of a super cool dungeon hack simulator
	     */
	        Weapon s = new Weapon("Broad Sword","slashes",10);
	        Weapon c = new Weapon("Arm","Claws",6);
	        Actor player = new Actor("Conan the Barbarian",10,10,s);
	        Actor monster = new Actor("Grumpy Troll",12,8,c);
	        Die d20 = new Die(20);
	        int round=0;
	                
	        // TODO: Modify this code to use a while loop - attacking until someone's dead!        
	        while (true) {
	            round++;
	            int roll = d20.roll();
	            System.out.printf("[Round=%d|Roll=%d|AC=%d] ",round,roll,monster.armorClass());
	            System.out.printf("%s %s his %s at the %s and "
	                    , player.name(), player.weapon().action()
	                    , player.weapon().name(), monster.name());
	            if (roll >= monster.armorClass()) {            
	                int damage = player.weapon().hitDamage();
	                if (roll==20) {
	                    damage = damage * 2;
	                    monster.takeDamage(damage);
	                    System.out.printf("hits for %d damage (a critical hit)", damage);                
	                } else {
	                    monster.takeDamage(damage);
	                    System.out.printf("hits for %d damage", damage);
	                }
	                if (monster.isDead()) {
	                    System.out.printf(", killing it");
	                }           
	            } else {
	                System.out.printf("misses");
	            }
	            System.out.println("!");
	            
	            //monster's turn
	            if (!monster.isDead()) {
	                roll = d20.roll();
	                System.out.printf("[Round=%d|Roll=%d|AC=%d] ",round,roll,player.armorClass());
	                System.out.printf("%s %s its %s at %s and "
	                    , monster.name(), monster.weapon().action()
	                    , monster.weapon().name(), player.name());
	                if (roll >= monster.armorClass()) {            
	                    int damage = monster.weapon().hitDamage();
	                    player.takeDamage(damage);
	                    System.out.printf("hits you for %d damage", damage);
	                    if (player.isDead()) {
	                        System.out.printf(", killing you");
	                    }           
	                } else {
	                    System.out.printf("misses");
	                }
	                System.out.println("!");
	            }
	            
	            //death checks
	            if (player.isDead()) {
	                System.out.printf("You are dead.\n");
	                break;
	            }
	            if (monster.isDead()) {
	                System.out.printf("The %s is dead.\n", monster.name());
	                break;
	            }
	        }
		
		
	}

}
