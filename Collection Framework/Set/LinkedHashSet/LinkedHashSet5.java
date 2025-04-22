import java.util.*;

public class LinkedHashSet5 {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 0, 4 };

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                set.remove(num); // Duplicate milte hi hata do
            } else {
                set.add(num); // Naya element to add kar do
            }
        }

        // Ab set ke first element ko print kar do without iterator
        for (int num : set) {
            System.out.println("First Non-Repeating Element: " + num);
            break; // Sirf first element print karna hai
        }
    }
}
