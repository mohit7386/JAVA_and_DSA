
//WAP to print all the possible subsequences of a string from the given string
import java.util.*;

public class Recursion13 {
    static void findSubsequences(String str, int idx, String newString) {
        // Base case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        // Subsequence nikalne ke liye do hi cheejein hain pehla current character ko
        // include kar do aur doosra current character ko exclude kar do
        // Find the current char
        char currentChar = str.charAt(idx);
        // Include the current char using recursive call
        findSubsequences(str, idx + 1, newString + currentChar);
        // Now Excluding the current character
        findSubsequences(str, idx + 1, newString);
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Subsequences of the given String are: ");
        // calling the function
        findSubsequences(str, 0, "");
        sc.close();
    }
}
