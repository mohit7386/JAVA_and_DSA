//WAP and find the first non-repeating character in the string using linkedhashmap
import java.util.*;

public class Linked_Hashmap5 {
    public static void main(String[] args) {
        String str = "abcabcbb";

        Map<Character, Integer> map = new LinkedHashMap<>();
        int maxLength = 0;
        String longestSubstr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                // Remove from beginning until duplicate is gone
                while (map.containsKey(ch)) {
                    map.remove(map.entrySet().iterator().next().getKey());
                }
            }

            map.put(ch, i);

            // Check if current window is largest
            if (map.size() > maxLength) {
                maxLength = map.size();

                // Build substring from current LinkedHashMap keys
                StringBuilder sb = new StringBuilder();
                for (char key : map.keySet()) {
                    sb.append(key);
                }
                longestSubstr = sb.toString();
            }
        }

        System.out.println("Longest substring length: " + maxLength);
        System.out.println("Longest substring itself: " + longestSubstr);
    }
}
