import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
        // creating a hashset
        HashSet<String> set = new HashSet<>(); // syntax of the hashset
        // adding the data into the set
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // duplicates are not allowed...hashset automatically removes the duplicates
        System.out.println(set); // order kuch bhi ho sakta hai random because insertion order is not maintained
                                 // in hashset
        // here we are using some important methods of the hashset
        System.out.println(set.contains("Banana")); // checking banana is present or not in the hashset
        System.out.println("Size of the set: " + set.size());
        System.out.println("Hashset is empty: " + set.isEmpty());
    }
}
