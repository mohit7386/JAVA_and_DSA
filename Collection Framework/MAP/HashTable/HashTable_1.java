import java.util.*;

public class HashTable_1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();

        table.put("India", 100);
        table.put("US", 300); // Duplicates are allowed in values but not in keys and when you try to add a
                              // duplicate key, it will override the previous value..
        table.put("China", 300);

        System.out.println(table); // Output: {US=200, China=300, India=100}

        System.out.println("India's Population: " + table.get("India"));
    }
}
