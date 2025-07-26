
//WAP to find the first non-repeating character in a string using HashTable.
import java.util.*;

public class HashTable_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "swiss";
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        Hashtable<Character, Integer> table = new Hashtable<>();

        for (char ch : str.toCharArray()) {
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (table.get(ch) == 1) {
                System.out.println("First non-repeating: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
