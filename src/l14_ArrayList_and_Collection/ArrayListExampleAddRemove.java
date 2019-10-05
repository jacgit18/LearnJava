/*
 * ArrayList Examples
 */
package l14_ArrayList_and_Collection;

import java.util.ArrayList;

public class ArrayListExampleAddRemove {

    public void Remove() {
        // ArrayList are dynamic collections of objects (reference types only)
        ArrayList<Student2> psy101 = new ArrayList<>();        
        // Adding some students
        psy101.add(new Student2("Bob",2.9));
        psy101.add(new Student2("Dave",3.2));
        psy101.add(new Student2("Sally",4.0));
        
                
        printStudents(psy101);              // print students
        Student2 tmp = psy101.remove(0);     // remove a student from postion 0
        printStudents(psy101);               
        psy101.add(tmp);                    // add back at in at the end
        printStudents(psy101);       
        psy101.add(new Student2("Bill",3.7));// can add to collection at any time
        printStudents(psy101);

        //Swap Sally(1) and Bob(2)
        tmp = psy101.get(1);            // Place Sally in tmp 
        psy101.set(1, psy101.get(2));   // Put Bob in Sally's position
        psy101.set(2, tmp);             // put tmp (Sally) in Bob's position
        printStudents(psy101);
        
    }
    
    public static void printStudents(ArrayList<Student2> al) {
        System.out.printf("Student\tGPA\n");
        System.out.printf("-------\t-------\n");
        for(int i=0;i< al.size();i++) {
            al.get(i).println();
        }
        System.out.println();
    }
}

