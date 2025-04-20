import java.util.*;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Loops
        System.out.println("Enter the value Till you want to run the loop!");
        int Till = sc.nextInt(); // Taking the input from the user
        for (int i = 1; i <= Till; i++) { // (initialisation; checking cond; increment/decrement)
            System.out.println("Hello I am for loops!");
        }
        sc.close();
    }

}
