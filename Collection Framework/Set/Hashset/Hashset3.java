
//WAP to find the all unique elements in the array of integers
import java.util.*;

public class Hashset3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating an array
        int[] arr = new int[10];
        // creating a hashset
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i] = sc.nextInt()); // all unique elements nikalne ke liye humne yahan pe Hashset isiliye kiyaa
                                            // hai kyuki ye duplicates ko automatic remove kar deta hai so agar hum
                                            // duplicate elements dete bhi hain to humein ye unique elements hi count
                                            // karke dega automatic duplicates bina count kiye
        }
        // size of the hashset means the total count of unique elements yahi to humme
        // chahiye tha
        System.out.println("Total Unique Elements: " + set.size());
        sc.close();

    }

}
