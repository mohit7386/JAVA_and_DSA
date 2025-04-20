
//WAP to print all the possible subsequences with the help of given string using recursion
import java.util.*;

public class Recursion6 {
    static void findSabsequences(String str, int index, String newString) {
        // Base case
        if (index == str.length()) {
            // Agar condition satisfy hoti hai to jitna bhi kuch new string me aya hota hai
            // usko print kar do
            System.out.println(newString);
            return;
        }
        // Include the current character
        findSabsequences(str, index + 1, newString + str.charAt(index)); // newstring me current character ko add kardo
                                                                         // and index ko move kardo next wale pe

        // Exclude the current character
        findSabsequences(str, index + 1, newString); // newstring me se current character ko exclude kar diyaa
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Total Subsequences of the String ' " + str + " ' is:");
        findSabsequences(str, 0, "");
        sc.close();
    }

}
