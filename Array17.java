
//WAP to find the missing number in an array 
//APPROACH :- 
//1- first array ko sort kar lenge jisse thoda easy ho jayega 
//2- 'N' find karna aur N hamara total number of count hai elements ka agar ek element missing hai to size me +1 kar denge to N ki value hogi missing hai to N=size+1; size me +1 ka mtlb hai ki usko bhi include karna number ko jo missing hai array me. 
//3- theoritical sum find karenge jiska formula hota hai - TS(theoritical sum) = (N*(N+1))/2; aur theritical sum wo sum hai jo 1 se N tak natural numbers ke sum ko find karne ke liye use hota hai.
//4- then fir Actual Sum nikalenge hum joki hamara sum hota hai elements ka array ke 
import java.util.*;

public class Array17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array!");
        int size = sc.nextInt();
        // creating an array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the Array!");
        for (int i = 0; i < arr.length; i++) {
            // Enter the elements in the array
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // sort the array and converted into ascending order jisse
        // thoda easy ho
        // jaaayegaa number ko find karna

        // It is used to count the elements present in the array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        // Now Theoritical sum ko calculate karne ke liye hum na 'N' ko calculate
        // karenge joki total number of elements ka count hota hai
        int N = count + 1;
        // Now ab calculate karenge theoritical sum and theoritical sum wo sum hota hai
        // 1 se leke N tak natural numbers ka sum hota hai ye....
        int Theoriticalsum = (N * (N + 1)) / 2;
        // Now we are calculating the actual sum which is the total sum of the elements
        // present in the array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // now finding the missing number
        int missingnumber = Theoriticalsum - sum;
        // Now printing the missing number
        System.out.println("The missing number is: " + missingnumber);
        sc.close();
    }

}
