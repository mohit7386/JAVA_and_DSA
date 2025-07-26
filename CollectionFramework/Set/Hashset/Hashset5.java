
//WAP to find the all duplicates in the given array using hashset
import java.util.*;

public class Hashset5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking the size of an array
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        // declare an array
        int[] arr = new int[n];
        // enter the elements in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // creating the hashset
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        // now adding the duplicates in the duplicate hashset which is taken from set
        // hashset
        for (int num : arr) {
            if (!set.add(num)) // jab hum set.add karte hain to ye naye element ko add karta hai aur true karta
                               // hai jab naya element add karte hain to but agar hum isme element add kar rahe
                               // hain jo set me pehle se exist karta hai to usko ye false return karta
                               // hai...to yahi hamara trigger point hoga agar jab bhi false return karega to
                               // usko humein true karwana hai iske liye reverse operator ka use karenge '!'
                               // iska....jisse ye true ho jaayega condition and true means duplicates bhi aa
                               // gaya aur condition agar satisfy hogi to true wale element ko means duplicate
                               // ko hum add kar denge duplicate set me
                duplicates.add(num);
        }
        // display duplicates
        if (duplicates.isEmpty()) {
            System.out.println("No Duplicates found!");
        } else {
            System.out.println("Duplicates found: " + duplicates);
            System.out.println("Total Duplicates: " + duplicates.size());
        }
        sc.close();
    }

}
