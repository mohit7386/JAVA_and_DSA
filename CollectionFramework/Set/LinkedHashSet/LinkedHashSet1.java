import java.util.*;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        // Creating a linkedhashset
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // adding the data into the set
        /*
         * So linkedhashset me jab hum elements add karenge to wo usi order me add honge
         * jis order me hum denge so ye order maintain rakhta hai ye increasing
         * decreasing maintain nahi karta hai ye bas hamara order maintain rakhta hai
         * jab jis order me hum denge bas usi order ko rakhta hai ye maintain and
         * duplicates ko add
         * nahi karta simple ignore kar deta hai
         */
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(40); // 40 is duplicate so this will not add into the set
        System.out.println("Set Elements are: " + set); // Backed by Hashtable and linkedlist -> Hashtable is for speed
                                                        // and linkedlist is for maintain the order.
                                                        // some methods of linkedhashset
        System.out.println(set.isEmpty());
        set.remove(20);
        System.out.println(set);
        System.out.println("Size of the set: " + set.size());
        System.out.println("Value 40 Exists ?: " + set.contains(40));
    }

}
