
//WAP to print the elements of an array present at even position
import java.util.*;

public class Array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking the size of an array from the user
        System.out.println("Enter the size of an Array!");
        int size = sc.nextInt();
        // creating an array
        int[] arr = new int[size];
        // Taking the elements in the array
        System.out.println("Enter the elements of the array!");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // traversing each element of the array and printint the elements which is
        // present at even positions in the array
        System.out.println("Your Even Positioned Elements!");
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) { //i+1 se hoga ye ki ye ek aage wali position pe jayega jisse automatic even position ayega 
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }

}
