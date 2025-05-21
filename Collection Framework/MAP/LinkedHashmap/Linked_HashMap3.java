
//WAP and find the first non-repeating character in the string using linkedhashmap
import java.util.*;

public class Linked_HashMap3 {
    public static void main(String[] args) {
        String str = "aabbcccdde";
        // creating a map
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1); // frequency nikalne ke liye each character ki
        }
        // Now traversing each element of the string and jiski frequency 1 hogi usko
        // print kara denge because 1 usi ki hogi jo ek baar aaya hoga
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }
        System.out.println("Non-repeating character not found!");

    }

}
