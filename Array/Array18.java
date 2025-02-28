
//WAP in java to print the pairs of 2 numbers whose sum is equal to the target
import java.util.*;

public class Array18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        // create an array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) { // taking the elements in the array
            arr[i] = sc.nextInt();
        }
        // taking a target number
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();
        // print the pairs
        System.out.println("Pairs of two numbers are:-");
        System.out.println("**************************");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
        System.out.println("**************************");
        sc.close();

    }

}
