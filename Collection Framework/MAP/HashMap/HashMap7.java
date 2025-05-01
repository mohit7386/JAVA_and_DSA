import java.util.*;

public class HashMap7 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 4, 1, 3, 3, 3 };

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1); // Jab hume kisi key ka frequency count rakhna ho, aur key pehli
                                                        // baar bhi aa sakti ho ya baar baar bhi — tab hum hamesha
                                                        // getOrDefault use karte hain.
        }

        int maxFreq = 0;
        int mostFrequent = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most Frequent Element: " + mostFrequent + " with frequency: " + maxFreq);
    }
}
