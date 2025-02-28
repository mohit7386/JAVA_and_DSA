
//WAP to traverse the each element of the string and remove the duplicates from the string
import java.util.Scanner;

public class Q6String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine(); // taking a string from the user

        String result = ""; // creating a empty string.

        // Loop to traverse through the input string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Current character
            // Check if character is not already in result
            if (result.indexOf(currentChar) == -1) { // Yeh check karta hai ki currentChar result string me already
                                                     // present hai ya nahi. aur result kya hai empty string jisme kuch
                                                     // hai nhi to condition true hoti rahegi and next baar condition
                                                     // false ho jayegi agar present hoga to true ho jaayegi aur exit ho
                                                     // jaayega loop se
                // Agar character present nahi hota, toh yeh -1 return karta hai.
                result = result + currentChar; // Add unique character to result
            }
        }

        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}
