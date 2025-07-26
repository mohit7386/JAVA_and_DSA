
//WAP to find intersection (common elements) of two arrays while preserving order using LinkedHashSet.
import java.util.*;

public class LinkedHashSet6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe of the 1st array: ");
        int s1 = sc.nextInt();
        System.out.println("Enter the size of the 2nd array: ");
        int s2 = sc.nextInt();
        // creating both arrays
        int[] arr1 = new int[s1];
        int[] arr2 = new int[s2];
        // taking elements in both the arrays
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the 2nd array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        // creating linkedhashset
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        LinkedHashSet<Integer> Commoneleset = new LinkedHashSet<>();

        // adding the elements in the set
        /*
         * Pehle arr1 ke elements store kiye, phir arr2 traverse karke jo match mile,
         * Commoneleset me daala.
         */
        for (int num : arr1) {
            set.add(num);
        }
        // adding and checking the data from set to arr2
        for (int num : arr2) {
            if (set.contains(num)) {
                Commoneleset.add(num);
            }
        }
        // print the commoneleset
        System.out.println(Commoneleset);

    }

}
