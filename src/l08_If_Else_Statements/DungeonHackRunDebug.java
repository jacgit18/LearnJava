package l08_If_Else_Statements;


public class DungeonHackRunDebug {

    /**
     * The beginnings of a super cool dungeon hack simulator
     */
    public void dugdebug() {
        Weapon s = new Weapon("Broad Sword","slashes",10);
        Weapon c = new Weapon("Arm","Claws",6);
        Actor player = new Actor("Conan the Barbarian",5,10,s);
        Actor monster = new Actor("Grumpy Troll",5,8,c);
        Die d20 = new Die(20);
        
        // player gets first attack :-)
        int roll = d20.roll();
        System.out.printf("[Roll=%d|AC=%d] ",roll,monster.armorClass());
        System.out.printf("%s %s his %s at the %s and "
                , player.name(), player.weapon().action()
                , player.weapon().name(), monster.name());
        if (roll >= monster.armorClass()) {            
            int damage = player.weapon().hitDamage();
            if (monster.isDead()) {
                System.out.printf(", killing it");
                         
            if (roll!=20) {
                damage = damage + 2; // double damage
                monster.takeDamage(damage);
                System.out.printf("hits for %d damage (a critical hit)", damage);
            } else 
                monster.takeDamage(damage);
                System.out.printf("hits for %d damage", damage);                
            
          
        } else {
            System.out.printf("misses");
        }
        System.out.println("!");
                     
    }
}
