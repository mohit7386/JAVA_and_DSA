
//WAP to find the first and last occurence of the character in a given string using recursion
import java.util.*;

public class Recursion9 {
    // Here first we declare the two static variables for tracking the first and
    // last character in the given string....aisa isiliye kiya humne kyuki jisse
    // recursion ke har level pe values first and last ki change na ho jaaye that's
    // why we set the first and last variable to static
    static int first = -1;
    static int last = -1;

    // now creating a recursive function
    static void findOccurence(String Str, char ch, int idx) {
        // creating base case for stopping the recursion
        if (idx == Str.length()) {
            System.out.println("First Occurence present at the index of: " + first);
            System.out.println("Last Occurence present at the index of: " + last);
            return; // when index is equal to the length of the string then we are stopping the
                    // recursion
        }
        // comparing the current char with the target character of the string
        if (Str.charAt(idx) == ch) {
            if (first == -1) { // ye humne isiliye likha kyuki agar character milta hai to check karenge ki ye
                               // character first time mila hai na kyuki -1 set hai that means ki pehle abhi
                               // tak koi character nhi mila hai isiliye agar ye true hogi that means ki pehli
                               // baar ye character mila hai to uske index ki value dal denge first me ki kis
                               // index pe mila hai ye
                first = idx;
            } else
                last = idx; // agar pehle mil chuka hai character aur condition false ho jaati -1 wali to wo
                            // idx value ko last variable me daal denge aur wo index last occurence ban
                            // jaayega
        }
        // recursive call to check the next character
        findOccurence(Str, ch, idx + 1);
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String Str = sc.nextLine();
        System.out.println("Enter the character you want to find the first and last occurence: ");
        char ch = sc.next().charAt(0);
        // calling the function
        findOccurence(Str, ch, 0);
        sc.close();
    }

}