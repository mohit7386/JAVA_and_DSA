
//WAP to find the maximum and minimum number in an array of elements
import java.util.*;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int size = sc.nextInt();
        // creating an array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array:- ");
        // inputting the elements in the array from the user
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        // Now we are assumming the maximum and minimum element of the array will be the
        // first element of the array
        int max = arr[0]; // set kar diya ki 0th index pe jo number hai wo hamara maximum number hai
        int min = arr[0];

        // Now traversing and checking the array elements if there is another greater
        // number or smaller in the array
        for (int i = 1; i < arr.length; i++) { // here we are starting the loop from the second number because first
                                               // number is already set with max
            if (arr[i] > max) { // check kar rahe hain poore array elements me ki aur koi to element max se bada
                                // nahi hai agar hai to usko max me store kar de rahe hain
                max = arr[i];
            }
            if (arr[i] < min) { // same for minimum number
                min = arr[i];
            }
        }
        // Printing the values of maximum and minimum
        System.out.println("The maximum number in the array is:- " + max);
        System.out.println("The minimum number in the array is:- " + min);
        sc.close();
    }

}
