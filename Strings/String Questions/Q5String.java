
//WAP to find which character is present in how many times....
import java.util.*;

public class Q5String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!");
        String str = sc.nextLine();
        System.out.println("Enter character you want to check in the string!");
        char character = sc.next().charAt(0); // taking a character input from the user
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Total Alphabets of " + character + " is:-" + count);
        sc.close();
    }
}