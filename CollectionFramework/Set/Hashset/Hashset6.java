import java.util.*;

public class Hashset6 {
    // create a method for checking all unique characters in the string
    public static boolean allUnique(String str) {
        HashSet<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) { // String ko humne ek array me convert kar diya jisse har ek element ko
                                           // easily traverse kiya ja sake element to element
            if (set.contains(c)) {
                return false; // Agar character pehle se set me hai -> Duplicate mila then condition false
            }
            set.add(c); // Agar Naya character hai to -> add kar do
        }

        return true; // Agar pura loop chal gaya bina false ke -> sab unique hain
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        if (allUnique(str)) {
            System.out.println("All characters are unique.");
        } else {
            System.out.println("Characters are not unique.");
        }

        sc.close();
    }
}
