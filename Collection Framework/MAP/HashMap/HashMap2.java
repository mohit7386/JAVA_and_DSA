import java.util.*;

public class HashMap2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // put -> inserting
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);

        // get -> fetching
        System.out.println("Population of India: " + map.get("India"));

        // containsKey -> check if a key exists
        System.out.println("Is UK present? " + map.containsKey("UK")); // Uk is not present in the map so it returns
                                                                       // false

        // updating existing value
        map.put("India", 110); // we can also change the value of the key by using 'put'.
        System.out.println("Updated Population of India: " + map.get("India"));

        // size of the map
        System.out.println("Size of Map: " + map.size());

        // remove the key-value pair - agar hum remove use kar rahe hain to wo map se
        // poore uss key-value pair ko remove kar dega
        map.remove("China");
        System.out.println("Map after removing China: " + map);
        System.out.println(map.keySet());
    }
}
