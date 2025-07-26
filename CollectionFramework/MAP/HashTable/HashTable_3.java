
//WAP to check if two strings are anagrams of each other.
import java.util.*;

public class HashTable_3 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        Hashtable<Character, Integer> table = new Hashtable<>();

        for (char ch : s1.toCharArray()) {
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            if (!table.containsKey(ch))
                return false;
            table.put(ch, table.get(ch) - 1);
            if (table.get(ch) == 0)
                table.remove(ch);
        }

        return table.isEmpty();
    }
}
