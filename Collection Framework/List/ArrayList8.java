//Create a list of strings using ArrayList, and sort it in reverse alphabetical order (Z to A).

import java.util.*;

public class ArrayList8 {
    public static void main(String[] args) {
        // Step 1: Create ArrayList
        List<String> names = new ArrayList<>();

        // Step 2: Add some names
        names.add("Ravi");
        names.add("Ankit");
        names.add("Meena");
        names.add("Zoya");
        names.add("bhavesh");

        // Step 3: Sort in reverse alphabetical order (Z to A)
        // names.sort(Collections.reverseOrder()); // It is not suitable method because
        // it is case-sensitive that's why 'A'
        // and 'a' both has different meaning that's why We need to Ignore case
        // for correct output

        // Reverse the elments (Z-A) with Ignore case
        names.sort((a, b) -> b.compareToIgnoreCase(a));

        // Step 4: Print the final list
        System.out.println("Sorted in reverse alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

// here we Understand What is Lambda and lambda Expression ?
/*
 * 🔷 Lambda Expression in Java — Basic Definition
 * ✅ Definition:
 * Lambda expression is a shorter way to write an anonymous function (method).
 * 
 * (parameter1, parameter2, ...) -> { body of the function }
 * 🔶 Use Case: Sorting with Comparator
 * Java me sort() method ko agar tum custom logic doge to usme Comparator
 * interface lagta hai, jisme compare(a, b) method hota hai.
 * 
 * ✅ Old Way (Before Java 8):
 * 
 * names.sort(new Comparator<String>() {
 * public int compare(String a, String b) {
 * return b.compareToIgnoreCase(a);
 * }
 * });
 * ✅ Lambda Way (Java 8+):
 * 
 * names.sort((a, b) -> b.compareToIgnoreCase(a));
 * ➡️ Yeh lambda expression exactly wahi kaam kar raha hai jo upar ka pura
 * anonymous class kar raha tha — but short & readable hai!
 * 
 * 🔍 Breaking Down (a, b) -> b.compareToIgnoreCase(a)
 * Part Meaning
 * (a, b) Two input parameters (Strings in this case)
 * -> Arrow symbol that separates parameters and function body
 * b.compareToIgnoreCase(a) Reverse alphabetical comparison (Z to A) ignoring
 * case
 */
