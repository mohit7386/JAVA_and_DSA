
//WAP to find the sum of all the elements present in the array
import java.util.*;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array!");
        int size = sc.nextInt();
        // creating the array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array!");
        // Taking elements from the user
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i + 1) + " is: ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        // Calculate the sum and print the sum of all the elements in the array
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i]; // Logic to calculate and add the sum of all the elements present in the array
        }
        System.out.println("The sum of all the elements in the array is:- " + sum);
        double average;
        average = (sum / size);
        System.out.println("The Average of the array is: " + average);
        sc.close();
    }

}
