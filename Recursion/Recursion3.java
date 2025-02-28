
//WAP to find the factorial of a number using recursion 
import java.util.*;

public class Recursion3 {
    static int findFactorial(int num) {
        // creating a base case
        if (num == 0) {
            return 1;
        }
        return num * findFactorial(num - 1); // Function calling itself and functions calls pehle ho rahi hain baad me
                                             // print ho raha hai to ye head recursion hai aur LIFO stack ko follow
                                             // krega to jo last call hogi wo 1 return karegi wahan se fr multiply hoga
                                             // logic aur fr factorial find hoga
    }

    // Last call stack me jaate hi condition true hogi aur return hoga 1 then tab
    // stack unwind hoga through the principle of LIFO
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + findFactorial(num));
        sc.close();
    }

}
