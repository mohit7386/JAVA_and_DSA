
//WAP and find the most frequent element in the string using hashmap
import java.util.*;

public class HashMap7 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 4, 1, 3, 3, 3 };

        Map<Integer, Integer> map = new HashMap<>();
        // isme Key = Array elements hain and Value = value jo hain wo frequencies hain
        // array ke elements ki

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1); // Jab hume kisi key ka frequency count karna ho aur sure nahi
                                                        // ho ki key pehle se present hai ya nahi hai tab iska hum use
                                                        // karte hain..
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
