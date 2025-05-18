
//WAP and find the two sum -> basically means hume target number diya hoga aur humein koi se do numbers ko array me se dhundhna hoga jinka sum target sum ke equal ho 
import java.util.*;

public class HashMap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Element: ");
        int target = sc.nextInt(); // target hai ye jo humein nikalna hai two numbers ka sum karke array ke
        // elements me se
        // creating a map
        Map<Integer, Integer> map = new HashMap<>();
        // Traverse each element of the array and find the complement
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i]; // compliement hum isiliye use kar rhe hain jisse mai doosra number nikal
                                               // payein jisse numbers ka sum milke two sum ban paaye
            if (map.containsKey(compliment)) {
                System.out.println("Indices: " + map.get(compliment) + " , " + i);
                return;
            }
            // agar map me compliment nahi hai to current element ko map me add kar denge...
            map.put(nums[i], i);
        }

    }

}
