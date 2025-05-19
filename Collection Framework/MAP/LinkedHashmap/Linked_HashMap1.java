import java.util.*;

public class Linked_HashMap1 {
    public static void main(String[] args) {
        // creating a LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        // Now added the data into the map
        map.put("Apple", 5);
        map.put("Banana", 4);
        map.put("Mango", 3);
        map.put("Orange", 2);

        // Traversing and printing the key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

            // Output -> same as it aayega order preserved rahega because maintains
            // insertion order jaisa order me aap doge usi orderr me output milega
        }
    }

}
