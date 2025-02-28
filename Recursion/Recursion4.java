
//WAP to find the fibonacci series of any number using recursion (Head Recursion)
import java.util.*;

public class Recursion4 {
    static int fibonacci(int num) {
        // Creating base cases
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        // Recursive call
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of terms for the Fibonacci Series: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci Series up to " + num + " Terms: ");
        // loop lagaya humne print karne ke liye saare terms ko
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }

}
