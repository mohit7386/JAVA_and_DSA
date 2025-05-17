
//WAP and find the intersecton of two maps
import java.util.*;

public class HashMap8 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 6 };
        int[] arr2 = { 2, 3, 5, 7 };

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Populate the HashMap with frequency (or simply existence) from arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1); // calculating the frequency of the elements in the array
        }
        // check each element in the arr2 if it is present in the map then added into
        // the result list
        for (int num : arr2) {
            if (map.containsKey(num)) {
                result.add(num);
            }
        }

        System.out.println("Intersection (using HashMap): " + result);
    }
}
