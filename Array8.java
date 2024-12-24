
//WAP to find the second largest element and second smallest element in the array
import java.util.*;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array!");
        int size = sc.nextInt();

        // creating a message when user enters an array elements lower then...
        if (size < 2) {
            System.out.println("Enter the size of an Array is greater then 2!");
            sc.close(); // here we are closing the scanner class here because agar condition true hogi
                        // to aage program me koi bhi inputs lene hi nahi hain yahin se program ko stop
                        // kar denge kyuki largest and smallest nikalne ke liye humein na kam se kam 3
                        // size ka array chahiye hoga aur har baar kaam ho jaane ke baad scanner class
                        // ko close kar denge
            return;
        }
        // creating an array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array!");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Taking elements of the array from the user
        }
        // initialising the largest to the minimum value jisse ki saare elements se
        // compare ache se ho jaye
        int largest = Integer.MIN_VALUE;
        int Second_largest = Integer.MIN_VALUE;
        // initialising the smallest to the maximum value
        int smallest = Integer.MAX_VALUE;
        int Second_smallest = Integer.MAX_VALUE;

        // Traverse the each element of the array and finding the largest and second
        // largest element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                Second_largest = largest;
                largest = arr[i];

            } else if (arr[i] > Second_largest && arr[i] != largest) {
                Second_largest = arr[i];
            }
        }
        // Traverse the each element of the array and find the smallest and second
        // smallest element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                Second_smallest = smallest;
                smallest = arr[i];

            } else if (arr[i] < Second_smallest && arr[i] != smallest) {
                Second_smallest = arr[i];
            }
        }
        // Handle edge case: If second largest or second smallest is not updated
        if (Second_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements might be the same).");
        } else {
            System.out.println("Second Largest Element = " + Second_largest);
        }

        if (Second_smallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found (all elements might be the same).");
        } else {
            System.out.println("Second Smallest Element = " + Second_smallest);
        }

        sc.close();
    }

}
