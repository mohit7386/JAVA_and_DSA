
//WAP to find the factorial of any number
import java.math.BigInteger;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:-");
        // int factorial = 1;
        BigInteger factorial = BigInteger.ONE; // BigInteger is used to find the long factorials without stackoverflow
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i)); // same as like factorial = factorial * i;
        }
        System.out.println("The Fatorial of " + num + " is:- " + factorial);
        sc.close();
    }

}
