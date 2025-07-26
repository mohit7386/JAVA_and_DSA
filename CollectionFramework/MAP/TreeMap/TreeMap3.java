package CollectionFramework.MAP.TreeMap;

//WAP and Count the number of keys less than a given key
import java.util.*;

public class TreeMap3 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(10, 1);
        map.put(20, 2);
        map.put(30, 3);
        map.put(40, 4);
        map.put(50, 5);

        int givenKey = 35;
        int count = 0;
        System.out.println("Keys less than " + givenKey + "are: ");
        for (Integer key : map.keySet()) {
            if (key < givenKey) {
                count++;
                System.out.println(key);
            } else {
                break; // keys are sorted so stop early
            }
        }

        System.out.println("Keys less than " + givenKey + ": " + count);
    }
}
