
//WAP to take a input from the user and print the array elements 
import java.util.*;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array!");
        // Taking the size of an array from the user
        int size = sc.nextInt();
        // array creation
        int[] arr = new int[size];
        // Taking elements from the user and putting into their indexies
        System.out.println("Enter the elements of the array!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " :- ");
            arr[i] = sc.nextInt(); // Taking the integer elements in the array
        }
        // Printing the elements of the array
        System.out.println("Printing the elements of the array!");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is: " + arr[i]);
        }
        sc.close();
    }
}
