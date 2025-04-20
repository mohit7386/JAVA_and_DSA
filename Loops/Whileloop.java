import java.util.*;

public class Whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value!");
        int num = sc.nextInt();
        // While loop
        int i = 1; // Sabse pehle while loop me hum initialisation karte hain
        while (i <= num) { // then condition check hoti hai
            System.out.println(i);
            i++; // then increment and decrement hota hai
        }
        sc.close();
    }

}
