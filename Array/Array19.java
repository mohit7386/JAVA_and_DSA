
//WAP to find the Intersection of two arrays 
import java.util.*;

public class Array19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.println("Enter the size of the first array:");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for second array
        int[] arr2 = new int[size1];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // Boolean array to track visited elements in arr2 isse duplicates elements
        // barbar print nahin honge aur array ka result ek dum specific hoga
        int[] visited = new int[size1];

        // Finding intersection
        System.out.println("Intersection of the two arrays:");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                // Check if elements match and arr2[j] is not yet used
                if (arr1[i] == arr2[j] && arr2[j] != visited[j]) { // !visited[j] - ye check karega ki arr2[j] ka
                                                                   // element pehle
                    // use hua hai ya nahi agar !visited[j] is false hai to iska
                    // matlab hai ki arr2[j] ka element pehle use nahi hua hai tabhi wo intersection
                    // ke liye allowed hai..
                    System.out.print(arr1[i] + " ");
                    visited[j] = -1; // Mark as used ki ye current element pehle se use ho chuka hai and it's just a
                                     // marker
                    break; // Move to the next element of arr1
                }
            }
        }

        sc.close();
    }
}
