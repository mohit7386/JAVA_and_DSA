
//WAP to print the new string after removing all the duplicates from the string
import java.util.*;

public class Recursion12 {
    // Creating one boolean type array to track the visited characters
    static boolean[] visited = new boolean[256]; // where 256 is the size for all ASCII Values
    // Creating recursive function

    static void removeDuplicates(String Str, int idx, StringBuilder newStr) {
        // Base Case jab index equal ho jaayega string ki full length ke then tab means
        // haamra array or string poora traverse ho chuka hai then print kar denge
        if (idx == Str.length()) {
            System.out.println("String After Removing Duplicates: " + newStr);
            return;
        }
        // Finding the current char
        char currentChar = Str.charAt(idx);
        if (!visited[currentChar]) { // agar jo hamara current character hai wo pehle nahi aaya hai visited array me
                                     // to hum usse mark kar denge aur add kar denge new string me
            visited[currentChar] = true; // mark currentchar ko true se
            newStr.append(currentChar); // Adding current character into the new string with the help of StringBuilder
                                        // to avoid the concat and adding
        }
        // Recursive Call for the next character
        removeDuplicates(Str, idx + 1, newStr);
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        // Calling Function
        removeDuplicates(str, 0, new StringBuilder());
        sc.close();
    }

}
