package CollectionFramework.MAP.TreeMap;

//Sort frequency of characters in a string in ascending order of characters (lexicographically sorted)
import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {
        String str = "treehouse";

        Map<Character, Integer> map = new TreeMap<>(); // TreeMap sorts characters

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character frequencies (sorted):");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
