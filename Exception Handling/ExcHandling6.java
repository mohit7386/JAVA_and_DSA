//throw in java - throw is used to explicitly throw an exception from your code 
//You can through built-in exceptions or custom exceptions.
//throw new exceptionType("Error Message");

//Arithmetic Exception throw
import java.util.*;

public class ExcHandling6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int validAge = 18;
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new ArithmeticException("Not Eligible to Vote!");
            }
            System.out.println("Valid Age: " + validAge);
        } catch (Exception e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }

    }
}
