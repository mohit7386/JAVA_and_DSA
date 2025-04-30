
//WAP and check the two strings are anagrams
import java.util.*;

public class HashMap6 {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        boolean result = areAnagrams(s1, s2);
        System.out.println("areAnagrams ? " + result);
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        // creating 2 maps for both the strings
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // traversing both the strings and find their frequency
        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        return map1.equals(map2);
    }

}
