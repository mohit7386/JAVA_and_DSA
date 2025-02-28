import java.util.*;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number! ");
        int num = sc.nextInt();
        int i = 5;
        if (num >= i) {
            System.out.println("Number is greater than or equal to " + i + "!");
        } else {
            System.out.println("Number is smaller than " + i + "!");
        }
        sc.close();
    }

}
