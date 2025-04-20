
//If Conditional Statements---
import java.util.*;

public class If {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number!");
        int num = sc.nextInt();
        if (num % 2 == 0) { // for even number condition
            System.out.println("Number is Even!");
        }
        if (num > 2) { // When number is greater than 2
            System.out.println("Number is greater then 2!");
        }
        sc.close();
    }

}
