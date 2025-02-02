
//WAP to print the new string in which all X letters will move to the end of the string 
import java.util.*;

public class Recursion11 {
    static void moveAllX(String str, int idx, int count, String newString) {
        // Creating the base case
        if (idx == str.length()) { // Jaise hi hamara idx poora string ki length tak traverse kar lega then tab hum
                                   // print kara denge and return kar denge recursion ko stop kar denge
            for (int i = 0; i < count; i++) { // count me jo x daale the count karaye the humne unko hum ab newstring me
                                              // add to kar dein then uske baad print kara denge
                newString += 'x';
            }
            System.out.println("New String after moving all x in the last: " + newString);
            return;
        }
        // finding the current char
        char currentChar = str.charAt(idx);
        // Tracking and comparing all the elements of the array
        if (str.charAt(idx) == 'x') {
            count++;
            // recursive call for next levels ko bhi calls lagayenge isiliye
            moveAllX(str, idx + 1, count, newString);
        } else {
            newString += currentChar;
            // again recursive calls for next levels aur humne next levels ko call lagayi
            // kyuki abhi kewal ek hi character add ho raha hai aur doosre characters ko bhi
            // to add karna hai na isiliye
            moveAllX(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        // calling the method and passing the values
        moveAllX(str, 0, 0, "");
        sc.close();
    }

}
