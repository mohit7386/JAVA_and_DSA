
//WAP and find the duplicates using hashmap
import java.util.*;

public class HashMap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // creating a map
        Map<Integer, Integer> map = new HashMap<>();
        // find the frequencies of the elements in the array and wahi to uske duplicates
        // hain kyuki jiski frequency 1 se jyada hogi wahi duplicates hain
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // after finding frequency we need to traverse each element and jiski frequency
        // greater then 1 hai usko print kar denge
        // and for traversing in the map we use entrySet() or KeySet()
        System.out.println("Duplicates Elements with their frequencies: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
                // Map ko traverse karte waqt usko modify karna safe nahi hota hai warna
                // ConcurrentModificationException de sakta hai ye...aur iss exception error ka
                // matlab hi yahi hota hai ki map ko traverse karte waqt aapne usko modisy kar
                // diya
            }
        }
    }

}
