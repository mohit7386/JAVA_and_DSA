//WAP to rotate an array of elements with the industry level approach and complexity wise 
//Kyuki jo purani wali approach hai na bhai wo jyada efficient nahi hai large arrays ke liye isiliye hum new approach se karenge jo large arrays ke liye aur industry basis pe bhttttt effiecient approach hai aur iski help se hum apne spaces ko bacha payenge aur memory save hogi.
import java.util.*;
public class Array15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array!");
        int size=sc.nextInt();
        //creating an array
        int[] arr=new int[size];
        System.out.println("Enter the elements in the array!");
        for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
        }
        //Enter no. of rotations as per user
        System.out.println("Enter how many times you want to rotate an array!");
        int rotations=sc.nextInt();
        //Normalize the rotations 
        rotations=rotations%size;
        //ab hum reversal ka use karke array ko rotate karenge ye tareeka efficient hai bahut jisse ek ek karke humein array ke elements ko rotate nahi karna padega aur large arrays ko rotate karne ke liye ye tareeka bhttttt efficient hai
        //aur ye logic jo hai wo hamara right rotation ke liye array ke
        reverseArray(arr, 0, size - 1);            // Reverse the entire array
        reverseArray(arr, 0, rotations - 1);      // Reverse the first part (rotation part of the array)
        reverseArray(arr, rotations, size - 1);   // Reverse the second part

        // Step 5: Display the rotated array
        System.out.println("Array after right rotation:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    // Helper function to reverse a portion of the array
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
