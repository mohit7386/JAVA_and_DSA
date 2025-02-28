
//WAP to reverse the elements of the array with the use of In-swapping Logic (Optimised Approach)
import java.util.*;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array!");
        int size = sc.nextInt(); // Taking the size from the user
        // creating an array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array!");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0, end = size - 1; // creating to variables one is start and another one is end which is point to
                                       // the start element of the array and end element of the array
                                       // traversing each element
        for (int i = 0; i < arr.length; i++) {
            while (start < end) { // condition tab tak chalegi jab tak start chota rahega end se isse hoga ye ki
                                  // ye end wale number se ek peeche tak wale number ko dekhega aur check krega
                                  // condition
                int temp = arr[start]; // creating the swap logic
                arr[start] = arr[end];
                arr[end] = temp;
                // Now incrementing the pointers for moving to the next element
                start++;
                end--;
            }
        }
        // Printing the reverse array
        System.out.println("Reversed Array!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
