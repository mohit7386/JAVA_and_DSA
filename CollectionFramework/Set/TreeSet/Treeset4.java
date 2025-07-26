
//WAP to create a reverse order view of TreeSet.
import java.util.*;

public class Treeset4 {
    public static void main(String[] args) {
        // creating a treeset
        TreeSet<Integer> set = new TreeSet<>();
        // adding the data in the set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        // printing the set into the descending order but by default treeset prints the
        // result in ascending order so we are using descendingSet() method for printing
        // the output into the descending order
        System.out.println("Descending order Set: " + set.descendingSet()); // descendingSet() method helps to print the
                                                                            // set result in descending order

    }

}
