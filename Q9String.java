
//WAP to check both the strings are Anagrams or not!
//Approach :- 
//1- Checking the length of both the strings
//2- string ko sort kar denge array me convert karke kyuki arrays.sort ka method apply kar rahe hain isiliye 
//3- frse sort kiye huye arrays ko String me convert kar denge 
//4- Then Strings ko dono Strings ko equality check karenge agar dono equal hogi sort karne ke baad then String Anagrams otherwise String Anagram nahi hai 
import java.util.*;

public class Q9String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String!");
        String Str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter the second String!");
        String Str2 = sc.nextLine().toLowerCase();
        if (Str1.length() == Str2.length()) { // checking rhe length of both the strings.
            // Converting the String to the character array with the help of toCharArray()
            // because we want to sort the
            // array with the use of Arrays.sort() method
            char[] charArray = Str1.toCharArray();
            char[] char2Array = Str2.toCharArray();
            Arrays.sort(charArray); // sort both the strings with their ASCII Values fir dono ek jaisi ho jayengi
            Arrays.sort(char2Array);
            // Now Converting back the character array to the Strings
            String newStr1 = new String(charArray);
            String newStr2 = new String(char2Array);
            if (newStr1.equals(newStr2)) { // Checking the equality of the strings if they are fully equal then only the
                                           // strings are anagrams otherwise not.
                System.out.println("The Strings are Anagrams!");
            } else {
                System.out.println("The Strings are not Anagrams!");
            }
        }
        sc.close();
    }

}
