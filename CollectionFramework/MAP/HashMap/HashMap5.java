
//WAP and find first non-repeating character in the string
import java.util.*;

public class HashMap5 {
    public static void main(String[] args) {
        String str = "aabccbdde";
        Character result = findFirstNonRepeatingChar(str); // here we are using 'Character' wrapper class because we
                                                           // want to store the primitive types into objects because hum
                                                           // collection padh rahe hain isiliye there is no primitive
                                                           // type.....there is only objects

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
                                            // element index to index
            map.put(ch, map.getOrDefault(ch, 0) + 1); // here we are counting the frequency of the character in a
                                                      // string...character ki frequency hum count kar rahe hain jisse
                                                      // ki agar koi character double baar aaya hai to uska count
                                                      // increase ho jaaye aur koi character kewal ek baar aaya hai to
                                                      // uska count 1 hi rahe jisse ki hume pata lag jaayega ki jiska
                                                      // count sabse pehle 1 tha wai hamara first non-repeating
                                                      // character hoga.
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
