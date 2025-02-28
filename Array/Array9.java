
//WAP to find and print the duplicates from the array
import java.util.*;

public class Array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking the size of an array from the user
        System.out.println("Enter the size of an array!");
        int size = sc.nextInt();
        // creating an array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array!");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Taking the elements in the array from the user
        }
        // checking the elements in the array by traversing
        // scenario ye hai ki sabse pehle pehla element lenge aur usse j ki help se
        // second element se leke baaki saare element se compare karenge ki wo equal hai
        // ya nahi
        System.out.println("Duplicate Elements are!");
        for (int i = 0; i < arr.length; i++) { // traversing each element of the array and comparing the ith element to
                                               // the jth element
            for (int j = i + 1; j < arr.length; j++) { // comparing starts with second element of the array
                if (arr[i] == arr[j]) {
                    // ab hum ye check karenge ki duplicates jo found hua hai wo already print to
                    // nhi hai kyuki suppose 1 agar 5 bar aaya hai to hume batana hai ki 1 duplicate
                    // hai but 1 paanch baar print na ho jaaye iske liye hum check karenge ki
                    // duplicates jo hain wo already to print hue hain ya nahi agar already print
                    // hai to fir dobara print nahi karenge
                    int k;
                    for (k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) { // checking ki duplicate jo hai wo already print ho chuka hai to loop ko
                                                // break kar denge aur yahin stop kar denge aur kuch bhi print nahi hoga
                            break;
                        }
                    }
                    if (k == i) { // duplicate agar pehle se print nahin hua hai to print kar denge array ke
                                  // duplicates
                                  // ko
                        System.out.println(arr[i]);
                    }
                }
            }
        }
        sc.close();
    }
}