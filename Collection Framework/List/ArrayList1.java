
//List - So first we start with ArrayList
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        // creating a list
        List<String> name = new ArrayList<>(); // here list is a variable and ArrayList is a list type you want
        // now we want to add data in the list
        name.add("Mohit");
        name.add("Lucky");
        name.add("Aman");
        name.add("Bosky");
        name.add("Tannu");
        name.add("Keeru");
        name.add("Sejal");
        // printing the list
        System.out.println(name);
        name.remove("Lucky"); // we can remove the element from the list
        System.out.println("After Removing Lucky: " + name);
        System.out.println("Name at index 2: " + name.get(2)); // we can access the element at the particular index
        System.out.println("Size of the list: " + name.size()); // we can accesss thee size of the list
        System.out.println("Check if list is empty: " + name.isEmpty());
        System.out.println("Replacing an element at index 2 with: " + name.set(1, "Srishti"));
        System.out.println(name); // After Replacing the element at particular index
        System.out.println("Check if Element exists: " + name.contains("Srishti")); // here we are checking the
                                                                                    // particular element is exist in
                                                                                    // the list or not
    }

}
