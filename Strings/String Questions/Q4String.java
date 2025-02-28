
//WAP to convert the first letter of the String into Uppercase
import java.util.*;

public class Q4String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!");
        String str = sc.nextLine();
        StringBuilder reversed = new StringBuilder(str).reverse();
        String result = reversed.toString(); // Converting a StringBuilder into the String because we need to use the
                                             // method of String for checking equality with these the and StrinBuilder
        System.out.println("Reverse of the String:- " + result); // toString() returns a string and we cannot use it
                                                                 // with StringBuilder...
        if (str.equals(result)) { // Type mismatch error because we want to compare string to the stringbuilder
                                  // which is not suitable and throws an error so we need to convert stringbuilder
                                  // into string then we can use str.equals mwthod which is a method of String
            System.out.println("The given string is a Palindrome String!");
        } else {
            System.out.println("The given string is Not a Palindrome String!");
        }

        sc.close();
    }

}
