
//Treeset to store elements in the set -> 
/*Duplicates are not allowed
 * maintain sorted order in ascending order -> sorted order maintain karne ke liye internally Red-Black tree ka use karta hai
 * comparison hoti hai har element ki, compareTo() method ka use krke (ya comparator ka)
 * agar comparison ke basis pe element same nikla (0 result aaya) to duplicate maan ke add nii karte
 * Time Complexity - O(log n)
 */
import java.util.*;

public class Treeset1 {
    public static void main(String[] args) {
        // creating a treeset
        TreeSet<Integer> set = new TreeSet<>();
        // adding the data into the treeset
        set.add(30);
        set.add(20);
        set.add(50);
        set.add(10);
        set.add(60);
        set.add(20); // duplicate ye add nahi hoga
        // maintains the ascending order
        // printing the set
        System.out.println("Treset elements are: " + set); // prints the result and automatically sort the elements of
                                                           // the set in ascending order
    }

}
