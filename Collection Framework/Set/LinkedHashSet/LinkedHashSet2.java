
//WAP and iterate the set from different iterations using for-each loop and Iterator->
import java.util.*;

public class LinkedHashSet2 {
    public static void main(String[] args) {
        // creating a linkedhashset
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // adding the data into the set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        // Now Iterating with different different loops -->
        // for-each loop
        System.out.println("Iterating using for-each loop");
        for (int num : set) {
            System.out.println(num);
        }
        // Using Iterator
        System.out.println("Iterating using Iterator");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
