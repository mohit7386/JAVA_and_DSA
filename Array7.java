
//WAP to check the array given by the user is sorted(In ascending) or not
//Logic Approach isko solve karne ki
//1- dekho agar koi array ascending order me sorted hoga to uska first position wala number chota hona chahiye aur second wala number bada hona chahiye 
//2- incase agar first number bada ho jata hai to sorted nhi hoga to hume check krna hoga poore array ko traverse kara ke ki 1st and 2nd element 2nd se bada to nhi hai agar hai to sorted nhi hai 
//3- main imp baat size array ka chalega size-1 tak kyuki arrayka size 5 hai to hum 2nd number le rahe hain to bhai 4th index value jab check krega to next wala 5th check krega joki exist nhi krta to error aa jayegi isiliye size-1 tak check karenge.
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Array size
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size]; // creating and initialising an array

        // Input: Array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if the array is sorted
        boolean isSorted = true; // Assume kar liya ki array jo hai wo sorted hai and boolean ki default value jo
                                 // hai wo false hoti hai

        for (int i = 0; i < size - 1; i++) { // yahan pe size-1 isiliye kiya hai kyuki jab bhi hum arr[i+1] ki condition
                                             // check karenge to wo size tak nhi nahi chalega because fir i+1 ke kaaran
                                             // wo ek index aage ho jayega joki exist hi nahi karta hai jiske kaaran out
                                             // of bound error aa jayega
                                             // isiliye size-1 tak check karayenge ek kam index tak chalega...
            if (arr[i] > arr[i + 1]) { // Check karenge ki kahin pe bhi poore array me agar first element bada ho jata
                                       // hai second wle se tab sorted nhi hoga because sorted ke liye first element
                                       // hamesha chota hona chahiye aur second element hamesha bada tabhi ascending
                                       // order me sort hoga array otherwise nahi hoga
                isSorted = false; // Found unsorted condition agar koi bhi condition satifies nhi hoti ha to ye
                                  // isSorted true hi hoga because iski initial value jo hai wo true set kar rakhi
                                  // hai isiliye
                break;
            }
        }

        // Output result
        if (isSorted) { // Ye isSorted ki current value pe depend karega agar wo true hai to if block
                        // chalega otherwise false hone pe else block chalega
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted.");
        }

        sc.close();
    }
}
