//Find Frequency of a name in a list

import java.util.ArrayList;

public class ArrayList6 {
    public static void main(String[] args) {
        // creating a list
        ArrayList<String> names = new ArrayList<>();
        // adding the names in the list
        names.add("Mohit");
        names.add("mohit");
        names.add("Rahul");
        names.add("rahul");
        names.add("Aman");
        names.add("mohit");
        names.add("mohit");

        // Now setting the target string which we want to find the string
        String Target = "Mohit";
        int count = 0;
        // Traversing and checking each element in the list and comparing if it is equal
        // then count increases and how many times the count increases that's our
        // frequency of the particular element
        for (String name : names) {
            if (name.equalsIgnoreCase(Target)) { // equals is used to compare the strings and IgnoreCase is used to
                                                 // ignore the upper and lower case of the string
                count++;
            }
        }
        System.out.println("Frequency of the " + Target + " is: " + count);
    }

}
