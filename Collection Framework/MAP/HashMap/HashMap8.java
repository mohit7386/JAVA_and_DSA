import java.util.*;

public class HashMap8 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 6 };
        int[] arr2 = { 2, 3, 5, 7 };

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Populate the HashMap with frequency (or simply existence) from arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check each element in arr2; if present in map add to result
        for (int num : arr2) {
            if (map.containsKey(num)) {
                result.add(num);
                // Optionally: remove the key if duplicate counts not needed
                // map.remove(num);
            }
        }

        System.out.println("Intersection (using HashMap): " + result);
    }
}
