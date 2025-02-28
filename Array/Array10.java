
//WAP to print the frequencies of elements in the array
import java.util.*;

public class Array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array!");
        // Taking the size of the array from the user
        int size = sc.nextInt();
        // creating an array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array!");
        // Taking the elements in the array from the user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // creating new array which is used to store the frequency of each element in
        // the array
        int[] fr = new int[size];
        int visited = -1; // mark kar denge uss index ko jo already counted ho gaya hoga it's only for
                          // marking the element of the particular index.
        // traversing each element in the array
        for (int i = 0; i < arr.length; i++) {
            int count = 1; // count 1 rahega kyuki ek baar to kam se kam element hoga hi
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { // comparing each element of the array to the next one aur check krenge ki next
                                        // element jo hai to first element ke same hai ya nahi hai.
                    count++;
                    fr[j] = visited; // yahan hum count ko increase karke j element ko visited mark kar denge aur
                                     // visited ki value ko uthake hum jth index pe daal denge mtlb mark kar denge
                                     // jisse pata lag sake ki ye already visited aur counted hai.
                }
            }
            // checking the ith element frequency array ka is not equal to visited and count
            // ki value ko ith
            // element me daal denge
            if (fr[i] != visited) { // iski help se hoga ye ki ye bar bar element ko ek hi element ko br br print
                                    // hone se rokega
                fr[i] = count;
            }
        }
        System.out.println("----------------------------------");
        System.out.println("Element  |  Frequency");
        System.out.println("----------------------------------");
        // Print the frequencies of each element of the array
        for (int i = 0; i < arr.length; i++) {
            if (fr[i] != visited) {
                System.out.println("   " + arr[i] + "  |  " + fr[i]);
            }
        }
        sc.close();
    }

}
