
//WAP to calculate the power of any number using recursion
import java.util.*;

public class Recursion5 {
    static int calculatePower(int x, int n) {
        // Creating a base case
        if (n == 0) {
            return 1; // because 'n' is the exponent of any number and agar kisi bhi number ki power
                      // agar 0 ho jaaye to uska answer 1 hota hai
        }
        return x * calculatePower(x, n - 1); // Recursive call and (x^n = x*x^n-1)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base: ");
        int x = sc.nextInt();
        System.out.println("Enter Exponent: ");
        int n = sc.nextInt();
        System.out.println(x + " ^ " + n + " is: " + calculatePower(x, n));
        sc.close();
    }

}
