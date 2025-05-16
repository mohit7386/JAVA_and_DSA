
//WAP and Iterating the hashmap with KeySet and entryset
import java.util.*;

public class HashMap3 {
    public static void main(String[] args) {
        // creating a hashmap
        Map<String, Integer> map = new HashMap<>();
        // adding the key-value pairs in map
        map.put("India", 100);
        map.put("USA", 89);
        map.put("UK", 97);
        map.put("Russia", 85);

        // Iterating using keyset()
        System.out.println("Iterating Keys using keySet: ");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.println();
        // Iterating using entries(entrySet())
        System.out.println("Iterating Entries Using entrySet: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
