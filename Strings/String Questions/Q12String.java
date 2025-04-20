
//WAP to count all the occurences present in the string
import java.util.Scanner;

public class Q12String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        String visited = ""; // Track karega visited characters ko

        // Har character ko check karne ke liye loop
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Current character ko access kiya

            // Iska kaam bas itna hai ki check krna ki koi character visited me hai ya nhi
            // aur repeat to nhi ho rha hai
            if (visited.indexOf(currentChar) != -1) {
                continue;
            }

            int count = 0; // Current character ka count
            for (int j = 0; j < str.length(); j++) { // Ye current char ko check karne ke liye poori string ko traverse
                                                     // karega aur match karega ki string me wo currentchar kitni baar
                                                     // aa raha hai
                if (str.charAt(j) == currentChar) {
                    count++; // Agar match milta hai to count increase karo
                }
            }

            // Character ko visited list me add karte hain
            visited += currentChar;
            // Output print karte hain
            System.out.println(currentChar + ": " + count);
        }
        sc.close();
    }
}
