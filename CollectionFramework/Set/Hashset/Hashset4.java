
//WAP to find the union of 2 arrays -> Union means dono arrays ke common elements ko find krna
import java.util.*;

public class Hashset4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking the size of the 2 arrays
        System.out.println("Enter the size of the 1st array!");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of the 2nd array!");
        int n2 = sc.nextInt();
        if (n1 == n2) {
            // declare 2 arrays
            int[] arr1 = new int[n1];
            System.out.println("Enter the elements in the 1st array: ");
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }
            int[] arr2 = new int[n2];
            System.out.println("Enter the elements in the 2nd array: ");
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextInt();
            }
            // creating an hashset
            HashSet<Integer> set = new HashSet<>();
            // adding the elements in the hashset
            for (int num : arr1) {
                set.add(num);
            }
            for (int num2 : arr2) {
                set.add(num2);
            }
            System.out.println("Union of 2 arrays: " + set); // Printing the union elements of the array and order
                                                             // random wise rahega kuch bhi ho sakta hai because hashset
                                                             // insertion order maintain nahi karta hai
        }

        else {
            System.out.println("size of both the arrays should be equal!");
            return;
        }

        sc.close();
    }

}
