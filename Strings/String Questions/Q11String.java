
//WAP to check the given string has only Digits with boolean method
import java.util.*;

public class Q11String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!");
        String str = sc.nextLine();
        boolean isDigitOnly = true; // Assume kar diya ki yahan humne bas initialise kiya hai isDigitOnly variable
                                    // ko
        // Traverse the each element of the string
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i); // accessing each character of the string
            if (character < '0' || character > '9') { // yahan condition check hogi aur boolean value set kar denge hum
                // false aur hamesha hum isse single code me likhenge kyuki character kewal
                // character ko hi store aur check karta hai isiliye humne isse single code me
                // likha hai
                isDigitOnly = false; // initialisation should be in small letters in boolean
                break; // stops the loop
            }
        }
        if (isDigitOnly) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }

}
