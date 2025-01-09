import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Kadane's Algorithm
        int maxSum = Integer.MIN_VALUE; // setting the maxSum to the most smaller value in the array
        int currentSum = 0; // Current sum tracker

        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i]; // Add every array element in the currentSum

            // Update maxSum if currentSum is greater than maxsum aur jab positive hoga na
            // tbhi hum isko aage continue krenge otheriwise currentSum ko 0 kar denge
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // Reset currentSum to 0 if it becomes negative
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // Output the maximum subarray sum
        System.out.println("Maximum Subarray Sum = " + maxSum);

        sc.close();
    }
}
