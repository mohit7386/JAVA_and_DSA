//WAP to find the element is present in the array or not
//Linear search is a simple searching algorithm used to find an element in an array. It works by sequentially checking each element of the array, one by one, until the desired element is found or the end of the array is reached.

/*How Linear Search Works
Start from the first element of the array.
Compare each element with the target value (the value you're searching for).
If a match is found, return the index of the element.
If the target value is not found after checking all elements, return a failure indicator (e.g., -1).*/
import java.util.*;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt(); // taking size input from the user
        // creating the array
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // taking the elements in the array in integer format
        }
        System.out.println("Enter the number you want to search in the array!");
        int num = sc.nextInt();
        boolean found = false; // setting the boolean value to false
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(+num + " is found at the index of " + i);
                found = true;

            }
        }
        if (!found) {
            System.out.println(+num + " not found!");
        }
        sc.close();
    }

}
