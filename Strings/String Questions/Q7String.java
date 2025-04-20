
//WAP to sort the array:- 
//Approach:-
//1- Sabse pehle string input lenge user se 
//2- Then uss string ko hum convert kar denge character array me with the help of str.tochararray()
//3- then hum usse Arrays.sort() method ka use karenge ye array ko ascending method me sort kar dega 
//4- fr wapas se usi array ko hum string me convert kar denge
//5- print kar denge usi string ko
import java.util.*;

public class Q7String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!");
        String str = sc.nextLine().toLowerCase();
        // Converting the string to the character array jisse sort karna thoda easy ho
        // jayega
        char[] charArray = str.toCharArray(); // tocharArray is a method of array which is used to convert the string
                                              // into an array
        Arrays.sort(charArray); // It helps to sort the array in ascending orderwi the help of their ASCII
                                // Values
        // Now reverse converting the characterArray to the String
        String SortedString = new String(charArray);
        System.out.println(SortedString); // Print the new sorted string
        sc.close();
    }

}
