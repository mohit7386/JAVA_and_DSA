
//WAP to print the total number of elements in the array
import java.util.*;

public class Array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array!");
        int size = sc.nextInt();
        // creating an array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array");
        // Taking the elements of the array from the user with the help of for each loop
        for (int i : arr) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        // traversoing each element
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println("Total Number of Elements present in the array!:- " + count);
        sc.close();

    }

}
