
//WAP to reverse the string using recursion (Tail recursion)
import java.util.*;

public class Recursion8 {
    static void printReverse(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return; // isko yahan rokna jaruri hai warna ye aage bhi check karta rahega 0 se neeche
                    // bhi
        }
        // Print karte jayenge reverse me ek ek character ko then recursive call karte
        // jayenge
        System.out.print(str.charAt(idx));
        printReverse(str, idx - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Reversed String: ");
        printReverse(str, str.length() - 1); // Passing the values to the recursive function and index starts with last
                                             // character
        sc.close();
    }
}
