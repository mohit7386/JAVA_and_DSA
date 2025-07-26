//WAP and find the length of the longest substring without repeating characters using hashmap
import java.util.*;

public class Hashmap11 {
    public static void main(String[] args) {
        String str = "abcabcbb";

        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0; // sliding window start

        for (int end = 0; end < str.length(); end++) {
            char ch = str.charAt(end);

            // If character is seen before, move the start pointer
            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }

            // Put/update character with its current index
            map.put(ch, end);

            // Calculate window length
            maxLen = Math.max(maxLen, end - start + 1);
        }

        System.out.println("Longest substring length: " + maxLen);
    }
}
