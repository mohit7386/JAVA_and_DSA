
//WAP to find the all possible substrings from the given string
import java.util.Scanner;

public class Q8String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        System.out.println("All Possible Substrings of the given string are:");
        // Outer loop for start index
        for (int i = 0; i < str.length(); i++) {
            // Inner loop for end index - ending index ka matlab jahan tak humein string ko
            // lena hai
            for (int j = i + 1; j <= str.length(); j++) {
                // Extract substring from index i to j-1
                String substring = str.substring(i, j); // i wala index inclusive hota hai aur j wala index exclusive
                                                        // hota hai matlab ek kam hota hai ek kam lenge agar j=3 hai to
                                                        // means wo include nhi hoga 2 include hoga
                System.out.println(substring);
            }
        }
        sc.close();
    }
}
