//WAP and find the frequencies of the characters in the string using Linkedhashmap but maintains insertion order.

import java.util.*;

public class Linked_HashMap2 {
    public static void main(String[] args) {
        String str = "aabbccdd";
        // creating a linkedhashmap
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        // count the frequencies of each character in the string
        for (char ch : str.toCharArray()) { // here we are using str.tocharArray because string ko humne ab ek character
                                            // array me convert kar liya jisse hum har ek element pe traverse kar payein
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
