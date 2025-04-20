import java.util.*;

public class ifelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number!");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even!");
        } else if (num < 0) {
            System.out.println("Number is Negative!");
        } else if (num == 6) {
            System.out.println("Number is equal to 6! and even number ");
        } else {
            System.out.println("Number is Odd!");
        }
        sc.close();

    }
}
