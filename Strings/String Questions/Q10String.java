
//WAP to check the given string has only digits or not...
import java.util.*;

public class Q10String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String!");
        String str = sc.nextLine(); // Taking a String input from the user
        // Running a loop from 0 to string length
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i); // Traversing the whole string and accessing the character at very index
                                            // from the string
            if (character < '0' || character > '9') { // Checking the condition if it is not the digit because if any
                                                      // string has an alphabet then it's ASCII Value will be greater
                                                      // then 9 so it returns false
                // statement false otherwise true
                System.out.println("False");
                sc.close();
                return;
            }
        }
        System.out.println("True");
        sc.close();
    }
}