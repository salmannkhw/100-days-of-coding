// Day 4 of 100

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Iterator;

public class DayFour {

    // store two type of info:      Key & Value
    // ex storing Contact details
    // Unordered Data Structure

    public static void main (String [] args) {

        HashMap<String, Float> BoltOns = new HashMap<>();                   // Create

        BoltOns.put("O2 Travel", 6.00f);                                     // Insertion
        BoltOns.put("International", 3.00f);
        BoltOns.put("MMS", 5.00f);

        System.out.println(BoltOns);                                        // Print

        BoltOns.put("MMS", 3.00f);                                          // Update the value of Key when put diff value in existing key
        
        System.out.println(BoltOns.containsKey("MMS"));                     // Look if key exist
        System.out.println(BoltOns.containsValue(3.00f));                   // Look if value5 exist

        System.out.println(BoltOns.get("MMS"));                             // Get Value

        /* --------------------------------------------------- New For Loop---------------------------------------------------

        New type of "for loop" for (int 5 : var)

        int marks [] = {12, 15, 18, 16, 10};
 
        for (int i = 0; i<marks.length;i++) {
            System.out.println(marks[i]);   }          Traditional way

        for (int i : marks) {
            System.out.println( i ); }                 New way

            -----------------------------------------------------------------------------------------------------------------*/

        for (Map.Entry <String, Float> e : BoltOns.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
 
        //+++++++++++++++++++++++++++++++++++++++++++++  HASH SET  +++++++++++++++++++++++++++++++++++++++++++++


    // Hashset does not allow duplicates
    // It is a very important data structure because of it's low Time complexity
    // They are not ordered

        
        // ----------------------------------------------------- Create -----------------------------------------------------
        HashSet<Integer> marks = new HashSet<>();
        
        // ----------------------------------------------------- Insert -----------------------------------------------------

        marks.add(3);
        marks.add(4);
        marks.add(4);
        marks.add(2);
        marks.add(7);

        // ----------------------------------------------------- Search -----------------------------------------------------

        System.out.println(marks.contains(2));      //  var.contains()          return true if exist. 

        // ----------------------------------------------------- Print -----------------------------------------------------

        System.out.println(marks);

        // ----------------------------------------------------- Delete -----------------------------------------------------

        marks.remove(4);

        System.out.println(marks.contains(4));
        System.out.println(marks);              //  Only a single copy of 4 was stored hence it was completely removed from set

        // ----------------------------------------------------- Size -----------------------------------------------------

        System.out.println("Size of your set is " + marks.size());

        // ----------------------------------------------------- iterator -----------------------------------------------------

        Iterator it = marks.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


}