
package l09_Switch_and_If_Else_Ladder;

import l09_Switch_and_If_Else_Ladder_P2.Direction;

public class EnumerationsRun {

    public void EnumRun() {
        // Demo of Enumerations in Java
        // d is "North"
        Direction d = Direction.North;
        
        // Print d
        System.out.printf("%s is at %d degrees.\n",d,d.Degrees());
        // Print East
        System.out.printf("%s is at %d degrees.\n",Direction.East,Direction.East.Degrees());
        
        
    }
}
