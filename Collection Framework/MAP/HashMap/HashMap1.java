
//WAP and add some key-value pairs in the map
import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        // creating the map
        Map<Integer, String> map = new HashMap<>(); // Integer is a wrapper class and String is a data type <Wrapper
                                                    // class , Data Type>
        // adding the key- value pairs in it
        map.put(1, "Mohit"); // put helps to add the data into the form of key-value pairs
        map.put(2, "Krish");
        map.put(3, "Tannu");
        map.put(4, "Aman");
        map.put(5, "Bosky");
        map.put(6, "Sejal");

        // Accesssing the value of key - agar humein kisi bhi key ki value ko janna hai
        // to hum get(key) ka use karte hain
        System.out.println("Value of the Key 2: " + map.get(2));
        // Printing full map
        System.out.println(map);
        // Printing all key-value pairs
        for (Map.Entry<Integer, String> entry : map.entrySet()) { // loop to mapping each key-value pairs
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }

}
/*
 * Working:
 * 
 * Hashing ka use hota hai internally key ko store karne ke liye (HashMap me).
 * 
 * Key ke basis pe fast searching hoti hai (O(1) time complexity mostly).
 * 
 */
