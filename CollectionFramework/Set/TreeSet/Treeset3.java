
//WAP to store the names of the students and store them in a treeset and sort them alphabetically
import java.util.*;

public class Treeset3 {
    public static void main(String[] args) {
        // creating a treeset
        TreeSet<String> set = new TreeSet<>();
        // adding the names of the students
        set.add("Mohit");
        set.add("Aman");
        set.add("Bosky");
        set.add("Krish");
        set.add("Sejal");
        // Treeset automatically sort the string in alphabetically order
        System.out.println("Sorted Names of Students: " + set);

    }

}
