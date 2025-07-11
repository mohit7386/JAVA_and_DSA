
//WAP and count the frequency of each character in the given string using HashTable.
import java.util.*;

public class HashTable_2 {
    public static void main(String[] args) {
        String str = "engineering";
        Hashtable<Character, Integer> table = new Hashtable<>();

        for (char ch : str.toCharArray()) {
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
