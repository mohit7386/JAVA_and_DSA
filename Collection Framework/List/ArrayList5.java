
//Create a Arraylist of names and sort them alphabetically.
import java.util.*;

public class ArrayList5 {
    public static void main(String[] args) {
        // creating a list
        List<String> names = new ArrayList<>();
        // adding the names in the list
        names.add("Mohit");
        names.add("Aman");
        names.add("Pradeep");
        names.add("abhay");
        names.add("sushant");

        // After adding the data into the list then we need to sort them alphabetically
        // Collections.sort(names); // used to sort the list names alphabetically in
        // ascending order (A-Z) But case-sensiitive ka problem yahan aayega jiske
        // capital and small letters ki ASCII values different hone ke kaaran ye error
        // de jaayega...

        // Lambda Expression for sorting
        names.sort((a, b) -> a.compareToIgnoreCase(b));

        // Printing each names of the list so we need loops
        System.out.println("Sorted Names: ");
        for (String name : names) {
            System.out.println(name);
        }

        // Now we want to reverse the list of elements
        Collections.reverse(names);
        // print the reverse elements
        System.out.println("Reversed List of Names: ");
        for (String Name : names) {
            System.out.println(Name);
        }
    }

}
