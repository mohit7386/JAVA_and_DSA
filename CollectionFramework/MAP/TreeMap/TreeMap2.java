package CollectionFramework.MAP.TreeMap;

//WAP to Print k-th smallest key from TreeMap
import java.util.*;

public class TreeMap2 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(10, 1);
        map.put(40, 2);
        map.put(30, 3);
        map.put(20, 4);

        int k = 2;
        int count = 0;

        for (Integer key : map.keySet()) {
            count++;
            if (count == k) {
                System.out.println(k + "th smallest key is: " + key);
                break;
            }
        }
    }
}
