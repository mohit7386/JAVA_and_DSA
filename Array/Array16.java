import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Step 2: Initialize the array and take input
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Input the number of rotations
        System.out.println("Enter the number of positions to rotate:");
        int rotations = sc.nextInt();

        // Normalize rotations (if rotations > size of array)
        rotations = rotations % size;

        // Step 4: Perform left rotation using reversal
        // For left rotation ke liye hum phle first part ko rotate kar denge fir second
        // part ko rotate kar denge then uske baad hum entire array ko rotate kar denge
        // isse ye hamara left rotate ho jaayega array
        reverseArray(arr, 0, rotations - 1); // Reverse the first part
        reverseArray(arr, rotations, size - 1); // Reverse the second part
        reverseArray(arr, 0, size - 1); // Reverse the entire array

        // Step 5: Display the rotated array
        System.out.println("Array after left rotation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    // Helper function to reverse a portion of the array
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
