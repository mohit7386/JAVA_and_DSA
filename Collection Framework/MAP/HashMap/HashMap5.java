import java.util.*;

public class HashMap5 {
    public static void main(String[] args) {
        String str = "aabccbd";
        Character result = findFirstNonRepeatingChar(str); // here we are using 'Character' wrapper class because we
                                                           // want to store the primitive type into objects

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static Character findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        // Step 1: Frequency count
        for (char ch : str.toCharArray()) { // convert the string into character array so that we can traverse the each
                                            // element easily
            map.put(ch, map.getOrDefault(ch, 0) + 1); // here we are counting the frequency of the character in a string
        }

        // Step 2: Find first non-repeating character
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return null; // If all characters repeat
    }
}
