
//WAP to check the given array is sorted or not (Strictly increasing)
import java.util.*;

public class Recursion10 {
    static boolean checkSorted(int arr[], int idx) {
        // base case
        if (idx == arr.length - 1) { // Jab koi bhi array end tk fully traverse karega with condition check then
                                     // tabhi jaake wo array sorted kehlayega otherwise nahi
            return true;
        }
        // So here we are checking for strictly increasing or sorted array the first
        // element of the array will always be smaller than second element
        if (arr[idx] < arr[idx + 1]) {
            // array is sorted and now recursive call for move to the other elements
            return checkSorted(arr, idx + 1);
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 6;
        // Taking the elements in the array
        System.out.print("Enter the elements in the array: ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // calling function
        System.out.println(checkSorted(arr, 0)); // boolean me value hoti hai to print karana padhta hai humein
        sc.close();

    }
}
