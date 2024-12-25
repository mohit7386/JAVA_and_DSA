
//WAP to find the duplicates in the array--
import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Creating the array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");
        // Checking for duplicates
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    // Check if this duplicate was already printed
                    int k;
                    for (k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) {
                            break;
                        }
                    }
                    if (k == i) { // Only print if not already printed
                        System.out.println(arr[i]);
                    }
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }
        sc.close();
    }
}
